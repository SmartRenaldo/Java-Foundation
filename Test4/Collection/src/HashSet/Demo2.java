package HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * 目标:Set系列集合元素无序的根本原因。(面试必考)
 * <p>
 * Set系列集合添加元素无序的根本原因是因为底层采用了哈希表存储元素。
 * <p>
 * JDK 1.8之前：哈希表 = 数组 + 链表  + （哈希算法）
 * JDK 1.8之后：哈希表 = 数组 + 链表 + 红黑树  + （哈希算法）
 * 当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。
 * <p>
 * 小结：
 * Set系列集合是基于哈希表存储数据的
 * 它的增删改查的性能都很好！！但是它是无序不重复的！如果不在意当然可以使用！
 */
public class Demo2 {
    public static void main(String[] args) {
/*
        对象.hashCode() 可以获取对象的哈希值，相当于是内存地址

        equals可以比较内容，返回true代表重复，如果返回false代表不重复

        在空白处 右键 Generate 选择equals() and hashCode()就可以自定义判断list集合是否重复的方法
        */
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("King", 13));
        studentSet.add(new Student("Queen", 12));
        studentSet.add(new Student("Jack", 11));

        System.out.println(studentSet);
    }
}
