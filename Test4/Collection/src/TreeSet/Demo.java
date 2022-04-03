package TreeSet;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        /**
         * 注意：如果类和集合都带有比较规则，优先使用集合自带的比较规则。
         *
         * 小结：
         *     TreeSet集合对自定义引用数据类型排序，默认无法进行。
         *     但是有两种方式可以让程序员定义大小规则：
         *          a.直接为对象的类实现比较器规则接口Comparable，重写比较方法（拓展方式）
         *          b.直接为集合设置比较器Comparator对象,重写比较方法
         *     注意：如果类和集合都带有比较规则，优先使用集合自带的比较规则。
         */
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Jack", 19, 5680.5));
        employees.add(new Employee("Zark",25,1085749.00));
        employees.add(new Employee("Queen", 17, 10876.25));
        employees.add(new Employee("Lady Gaga", 24, 108292.00));

        System.out.println(employees);

        //在集合中创建匿名内部类来进行比较
        TreeSet<Employee> employees1 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        employees1.add(new Employee("Jack", 19, 5680.5));
        employees1.add(new Employee("Zark",25,1085749.00));
        employees1.add(new Employee("Queen", 17, 10876.25));
        employees1.add(new Employee("Lady Gaga", 24, 108292.00));

        System.out.println(employees1);

        TreeSet<Employee> employees2 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());    //字符串比较
            }
        });
        employees2.add(new Employee("Jack", 19, 5680.5));
        employees2.add(new Employee("Zark",25,1085749.00));
        employees2.add(new Employee("Queen", 17, 10876.25));
        employees2.add(new Employee("Lady Gaga", 24, 108292.00));

        System.out.println(employees2);
    }
}
