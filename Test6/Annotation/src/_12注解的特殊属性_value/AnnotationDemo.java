package _12注解的特殊属性_value;

/**
 * 目标：注解的特殊属性名称：value
 * value属性，如果只有一个value属性的情况下，
 * 使用value属性的时候可以省略value名称不写!!
 * <p>
 * 但是如果有多个属性,且多个属性没有默认值，那么value是不能省略的
 * (如果有两个属性，且value之外的属性有默认值，那么value可以省略)
 */
@Book("/deleteBook.action")
@Person(value = "Morrison", age = 67)
@Animal(value = "Tiger")
public class AnnotationDemo {
}

/**
 * @author Gavin
 */
@interface Book {
    String value();
}

@interface Person {
    String value();

    int age();
}

@interface Animal {
    String value();

    int age() default 0;
}
