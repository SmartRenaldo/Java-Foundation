import java.util.*;

//没有List方法好用
public class Demo10_Fight_The_Landlord {
    public final static Map<Card, Integer> ALL_CARDS_SIZE = new HashMap<>();
    public final static List<Card> ALL_CARDS = new ArrayList<>();

    static {
        //类型确定，个数确定，请用数组存储
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥", "♠", "♣", "♦"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                ALL_CARDS_SIZE.put(new Card(number, color), index++);
                ALL_CARDS.add(new Card(number, color));
            }
        }
        ALL_CARDS_SIZE.put(new Card("大王", ""), index++);
        ALL_CARDS_SIZE.put(new Card("小王", ""), index++);
        Collections.addAll(ALL_CARDS, new Card("大王", ""), new Card("小王", ""));
        System.out.println("A new deck:\n" + ALL_CARDS);
    }

    public static void main(String[] args) {
        //打乱牌
        Collections.shuffle(ALL_CARDS);
        System.out.println("Disorganised deck:\n" + ALL_CARDS);

        //3 Players
        List<Card> player01 = new ArrayList<>();
        List<Card> player02 = new ArrayList<>();
        List<Card> player03 = new ArrayList<>();

        //deal cards with last three keeping(发牌)
        for (int i = 0; i < ALL_CARDS.size() - 3; i++) {
            if (i % 3 == 0) {
                player01.add(ALL_CARDS.get(i));
            } else if (i % 3 == 1) {
                player02.add(ALL_CARDS.get(i));
            } else {
                player03.add(ALL_CARDS.get(i));
            }
        }

        //截取集合的最后三张牌到一个新的List中
        List<Card> lastThreeCards = ALL_CARDS.subList(ALL_CARDS.size() - 3, ALL_CARDS.size());

        //show deck
        System.out.println("Before sort:");
        System.out.println("player01: " + player01);
        System.out.println("player02: " + player02);
        System.out.println("player03: " + player03);
        System.out.println("Remaining cards: " + lastThreeCards);

        //sort
        sortCards(player01);
        sortCards(player02);
        sortCards(player03);
        sortCards(lastThreeCards);

        //show deck
        System.out.println("After sort:");
        System.out.println("player01: " + player01);
        System.out.println("player02: " + player02);
        System.out.println("player03: " + player03);
        System.out.println("Remaining cards: " + lastThreeCards);
    }

    private static void sortCards(List<Card> player) {
        player.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return ALL_CARDS_SIZE.get(o1) - ALL_CARDS_SIZE.get(o2);
            }
        });
    }
}
