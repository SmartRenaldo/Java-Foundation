package _11注解的属性;

/**
 * 目标：注解的属性：
 * <p>
 * 属性的格式
 * - 格式1：数据类型 属性名();
 * - 格式2：数据类型 属性名() default 默认值;
 * <p>
 * 属性适用的数据类型:
 * 八种数据数据类型(int，short，long，double，byte
 * ，char，boolean，float)
 * String，Class
 * 以上类型的数组形式都支持
 * <p>
 * 小结：
 * 注解可以有属性，属性名必须带()
 * 在用注解的时候，属性必须赋值，除非这个属性有默认值！！
 */
@Book(name = "Learning Java", authors = {"Mike", "Pence"}, price = 99.99)
public class AnnotationDemo {
    @Book(address = "Adelaide", authors = {"Scoot", "Morrison"}, name = "MySQL", price = 199.99)
    public static void main(String[] args) {

    }
}

/**
 * @author Gavin
 */
@interface Book {
    String name();

    String[] authors();

    double price();

    String address() default "Perth";
}
