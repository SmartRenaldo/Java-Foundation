package _homework01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2. 请定义注解@MyAnno2：
 * 1) 包含一个String类型的属性“type”，并且定义默认值“java”。
 * 2) 此注解只能修饰“字段”。
 * 3) 此注解只需要能够在源码中使用。
 * 4) 定义测试类：Test2，随意定义一个成员属性，并使用此注解；
 *
 * @author Gavin
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@MyAnno1
public @interface MyAnno2 {
    String value() default "java";
}

class TestMyAnno2 {
    @MyAnno2
    private int age;

    @MyAnno2
    private static String add;

    @MyAnno2
    private static final int TEN = 10;

    @MyAnno2
    private final int num = 5;
}
