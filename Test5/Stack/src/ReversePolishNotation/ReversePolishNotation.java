package ReversePolishNotation;

import java.util.*;

public class ReversePolishNotation {
    private final static int ADD = 1;
    private final static int SUB = 1;
    private final static int MUL = 2;
    private final static int DIV = 2;


    //先定义逆波兰式
    //（3 + 4） * 5 - 6 => 3 4 + 5 * 6 -
    //说明为了方便，逆波兰式表达式的数字和符号使用空格隔开
    //思路
    //1.先将“3 4 + 5 * 6 -” 放到ArrayList中
    //2.将ArrayList传递给一个方法，遍历ArrayList配合栈完成计算
    //将“3 4 + 5 * 6 -” 放到ArrayList中

    private static List<String> getListString(String str) {
        List<String> list = new ArrayList<>();
        String[] split = str.split(" ");
        for (String item : split) {
            list.add(item);
        }
        return list;
    }
    //完成对逆波兰式的运算
    /*
     * 1)从左至右扫描，将3和4压入堆栈;
     * 2)遇到+运算符，因此弹出4和3 (4为栈项元素，3为次顶元素)，计算出3+4的值，得7，再将7入
     * 3) 将5入栈;
     * 4)接下来是X运算符，因此弹出5和7，计算出7X5=35，将35入栈;
     * 5) 将6入栈;
     * 6) 最后是-运算符，计算出35-6的值， 即29， 由此得出最终结果
     * */

    public static int calculate(List<String> list) {
        Stack<String> stack = new Stack<>();
        for (String s : list) {
            if (s.matches("\\d+")) {
                stack.push(s);
            } else {
                int res = 0;
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                if ("+".equals(s)) {
                    res = num1 + num2;
                } else if ("-".equals(s)) {
                    res = num1 - num2;
                } else if ("*".equals(s)) {
                    res = num1 * num2;
                } else if ("/".equals(s)) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("Wrong operator!");
                }
                stack.push(String.valueOf(res));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private static List<String> toInfixExpressionList(String string) {
        List<String> list = new ArrayList<>();
        //定义索引
        int i = 0;
        //对多位数进行拼接
        StringBuilder s;
        //遍历每个字符
        char ch;

        do {
            //如果ch是一个字符
            if ((ch = string.charAt(i)) < 48 || (ch = string.charAt(i)) > 57) {
                list.add(String.valueOf(ch));
                i++;
            } else {     //如果是数字，考虑多位数
                s = new StringBuilder();     //每次使用前置空
                while (i < string.length() && (string.charAt(i)) >= 48 && (ch = string.charAt(i)) <= 57) {
                    s.append(ch);
                    i++;
                }
                list.add(s.toString());
            }
        } while (i < string.length());
        return list;
    }

    private static List<String> parseSuffixExpression(List<String> list) {
        //初始化两个栈：运算符栈 s1(stringStack) 和储存中间结果的栈 s2(stringList)；
        //因为s2这个栈在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出，直接使用 List<String>
        Stack<String> stringStack = new Stack<>();
        List<String> stringList = new ArrayList<>();

        //遍历
        for (String item : list) {
            //如果是一个数，加入s2
            if (item.matches("\\d+")) {
                stringList.add(item);
                //遇到运算符时，比较其与 s1 栈顶运算符的优先级：
                //如果 s1 为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈；
            } else if ("(".equals(item)) {
                stringStack.push(item);
                //如果是右括号，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止
            } else if (")".equals(item)) {
                while (!"(".equals(stringStack.peek())) {
                    stringList.add(stringStack.pop());
                }
                //将这一对括号丢弃
                stringStack.pop();
                //遇到运算符
            } else {
                //4.3 当item的优先级小于等于s1栈顶运算符, 将s1栈顶的运算符弹出并加入到s2中再次与s1中新的栈顶运算符相比较
                while (stringStack.size() != 0 && getValue(stringStack.peek()) >= getValue(item)) {
                    stringList.add(stringStack.pop());
                }
                //4.2 若优先级比栈顶运算符的高，也将运算符压入 s1；
                stringStack.push(item);
            }
        }

        while (stringStack.size() != 0) {
            stringList.add(stringStack.pop());
        }

        return stringList;
    }

    public static int getValue(String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            case "(", ")":
                break;
            default:
                System.out.println("Wrong operator!");
                break;
        }
        return result;
    }

    public static int calculate(String str) {
/*若getListString和calculate为非静态方法
        List<String> listString = new ReversePolishNotation().getListString(str);
        return new ReversePolishNotation().calculate(listString);
*/
        List<String> suffixExpression = parseSuffixExpression(toInfixExpressionList(str));
        return calculate(suffixExpression);
    }
}
