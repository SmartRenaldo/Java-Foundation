import java.util.Collection;
import java.util.LinkedList;

public class Demo3 {
    //JDK 1.8开始之后的新技术Lambda表达式(了解)
    public static void main(String[] args) {
        Collection<String> lists = new LinkedList<>();
        lists.add("Catherine");
        lists.add("Janette");
        lists.add("Victoria");
        lists.add("Judy");
        lists.add("Robin");

        lists.forEach(s -> {
            System.out.println(s);
        });

        lists.forEach(s -> System.out.println(s));

        lists.forEach(System.out::println);
    }
}
