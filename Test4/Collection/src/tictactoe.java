import java.io.*;
import java.util.*;
import java.util.List;

public class tictactoe {
    //first move
    private static final char PLAYER_X = 'x';
    //second move
    private static final char PLAYER_O = 'o';
    //write the content in contentList to txt
    private static final List<String> CONTENT_LIST = new ArrayList<>();
    private static final Map<String, Integer> MAP = new LinkedHashMap<>();

    public static void main(String[] args) {
        String input = args[0];
        String pathname = args[1];
        String turn = getTurn(input);

        if (args.length == 2) {
            minimax(0, input);
        } else {
            alpha_beta(input, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }

        try (PrintStream printStream = new PrintStream(pathname)) {
            CONTENT_LIST.forEach(printStream::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (!MAP.isEmpty()) {
            List<String> positiveList = new ArrayList<>();
            List<String> zeroList = new ArrayList<>();
            List<String> negativeList = new ArrayList<>();

            MAP.forEach((k, v) -> {
                if (v == 1) {
                    positiveList.add(k);
                } else if (v == 0) {
                    zeroList.add(k);
                } else {
                    negativeList.add(k);
                }
            });

            if ("x".equals(turn)) {
                if (!positiveList.isEmpty()) {
                    System.out.println(positiveList.get(0));
                } else if (!zeroList.isEmpty()) {
                    System.out.println(zeroList.get(0));
                } else if (!negativeList.isEmpty()) {
                    System.out.println(negativeList.get(0));
                }
            } else {
                if (!negativeList.isEmpty()) {
                    System.out.println(negativeList.get(0));
                } else if (!zeroList.isEmpty()) {
                    System.out.println(zeroList.get(0));
                } else if (!positiveList.isEmpty()) {
                    System.out.println(positiveList.get(0));
                }
            }
        }
    }

    private static int alpha_beta(String input, int alpha, int beta, int depth) {
        if (hasWon(input, PLAYER_X)) {
            return 1;
        }

        if (hasWon(input, PLAYER_O)) {
            return -1;
        }

        List<Integer> remainedCells = getRemainedCells(input);

        if (remainedCells.isEmpty()) {
            return 0;
        }

        if ("x".equals(getTurn(input))) {
            return getMax(input, alpha, beta, depth);
        } else {
            return getMin(input, alpha, beta, depth);
        }
    }

    private static int getMax(String input, int alpha, int beta, int depth) {
        int bestIndex = -1;
        String turn = getTurn(input);
        int utility = Integer.MIN_VALUE;

        for (Integer cell : getRemainedCells(input)) {

            if (input.charAt(cell) == '-') {
                String replacedInput = input.substring(0, cell) + turn + input.substring(cell + 1);
                int score = alpha_beta(replacedInput, alpha, beta, depth + 1);
                utility = Math.max(utility, score);
                CONTENT_LIST.add(replacedInput + " " + score);

                if (score > alpha) {
                    alpha = score;
                    bestIndex = cell;
                }

                if (alpha >= beta) {
                    break;
                }

                if (bestIndex != -1 && depth == 0) {
                    MAP.put(replacedInput, score);
                }
            }
        }

        return utility;
    }

    private static int getMin(String input, int alpha, int beta, int depth) {
        int bestIndex = -1;
        String turn = getTurn(input);
        int utility = Integer.MAX_VALUE;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                String replacedInput = input.substring(0, i) + turn + input.substring(i + 1);
                int score = alpha_beta(replacedInput, alpha, beta, depth + 1);
                utility = Math.min(utility, score);
                CONTENT_LIST.add(replacedInput + " " + score);

                if (score < beta) {
                    beta = score;
                    bestIndex = i;
                }

                if (alpha >= beta) {
                    break;
                }

                if (bestIndex != -1 && depth == 0) {
                    MAP.put(replacedInput, score);
                }
            }
        }


        return utility;
    }

    private static List<Integer> getRemainedCells(String input) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            char ch = input.charAt(i);

            if (ch == '-') {
                list.add(i);
            }
        }

        return list;
    }

    private static boolean hasWon(String input, char player) {
        for (int i = 0; i < 3; i++) {
            if (//column
                    (input.charAt(i) == input.charAt(i + 3) && input.charAt(i) == input.charAt(i + 6) && input.charAt(i) == player) ||
                            //row
                            (input.charAt(3 * i) == input.charAt(3 * i + 1) && input.charAt(3 * i) == input.charAt(3 * i + 2) && input.charAt(3 * i) == player) ||
                            //diagonal
                            (input.charAt(0) == input.charAt(4) && input.charAt(0) == input.charAt(8) && input.charAt(0) == player) ||
                            (input.charAt(2) == input.charAt(4) && input.charAt(2) == input.charAt(6) && input.charAt(2) == player)
            ) {
                return true;
            }
        }

        return false;
    }

    private static int prune(int depth, String input, int alpha, int beta) {
        if (hasWon(input, PLAYER_X)) {
            return 1;
        }

        if (hasWon(input, PLAYER_O)) {
            return -1;
        }

        List<Integer> remainedCells = getRemainedCells(input);

        if (remainedCells.isEmpty()) {
            return 0;
        }

        String turn = getTurn(input);
        int score;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                String replacedInput = input.substring(0, i) + turn + input.substring(i + 1);
                score = prune(depth + 1, replacedInput, alpha, beta);
                maxVal = Math.max(maxVal, score);
                CONTENT_LIST.add(replacedInput + " " + score);

                if (depth == 0) {
                    MAP.put(replacedInput, score);
                }

                alpha = Math.max(maxVal, alpha);

                if (alpha >= beta) {
                    break;
                }
            }
        }

        return maxVal;
    }

    private static int minimax(int depth, String input) {
        if (hasWon(input, PLAYER_X)) {
            return 1;
        }

        if (hasWon(input, PLAYER_O)) {
            return -1;
        }

        List<Integer> remainedCells = getRemainedCells(input);

        if (remainedCells.isEmpty()) {
            return 0;
        }

        String turn = getTurn(input);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                String replacedInput = input.substring(0, i) + turn + input.substring(i + 1);
                int score = minimax(depth + 1, replacedInput);
                CONTENT_LIST.add(replacedInput + " " + score);

                if (depth == 0) {
                    MAP.put(replacedInput, score);
                }

                if ("x".equals(turn)) {
                    max = Math.max(max, score);
                } else if ("o".equals(turn)) {
                    min = Math.min(min, score);
                }
            }
        }

        return "x".equals(turn) ? max : min;
    }

    private static boolean isOver(String input) {
        return hasWon(input, PLAYER_X) || hasWon(input, PLAYER_O) || getRemainedCells(input).isEmpty();
    }

    private static String getTurn(String input) {
        int xNum = 0;
        int oNum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == PLAYER_X) {
                xNum++;
            } else if (input.charAt(i) == PLAYER_O) {
                oNum++;
            }
        }

        if (xNum == oNum) {
            return "x";
        }

        return "o";
    }
}
