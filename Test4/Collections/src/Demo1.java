import java.util.*;

/*

 java.utils.Collections是集合工具类，用来对集合进行操作。

 常用方法如下：

 public static <T> boolean addAll(Collection<? super T> c, T... elements):批量添加元素

 public static void shuffle(List<?> list):打乱集合顺序。

 public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

 public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

 */
public class Demo1 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        Collections.addAll(set, 13.67, 45.4, -82.4);
        System.out.println(set);

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Simple", "Strategy", "KPI", "Objective");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        LinkedList<Student> students = new LinkedList<>();
        Collections.addAll(students, new Student("Tiffanty", 18, 4789.50),
                new Student("Jason", 22, 545.00),
                new Student("Bin", 17, 56978.25));
        System.out.println(students.getFirst());
        System.out.println(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(students);

        //调用sort方法时，可以把Collections换成students
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getTuitionFee(),o2.getTuitionFee());
            }
        });
        System.out.println(students);
    }
}
