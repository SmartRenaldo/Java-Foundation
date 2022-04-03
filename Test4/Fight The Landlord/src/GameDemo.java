import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    //1. 定义一个静态集合，存储54张牌，集合只需要一个
    public static final List<Card> ALL_CARDS = new ArrayList<>();

    //2. make cards
    static {
        //类型确定，个数确定，请用数组存储
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥", "♠", "♣", "♦"};
        int index = 0;
        //把点数与花色组成的牌对象储存到集合中
        for (String number : numbers) {
            for (String color : colors) {
                ALL_CARDS.add(new Card(number, color, index++));
            }
        }
        Collections.addAll(ALL_CARDS, new Card("小王", "", index++), new Card("大王", "", index++));

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
        System.out.println("Player01: " + player01);
        System.out.println("Player02: " + player02);
        System.out.println("Player03: " + player03);
        System.out.println("Remaining cards: " + lastThreeCards);

        //sort
        sortCards(player01);
        sortCards(player02);
        sortCards(player03);
        sortCards(lastThreeCards);

        //show deck
        System.out.println("After sort:");
        System.out.println("Player01: " + player01);
        System.out.println("Player02: " + player02);
        System.out.println("Player03: " + player03);
        System.out.println("Remaining cards: " + lastThreeCards);
    }

    private static void sortCards(List<Card> player) {
/*        Collections.sort(player, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex() - o2.getIndex();
            }
        });*/
        player.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex() - o2.getIndex();
            }
        });
    }
}
