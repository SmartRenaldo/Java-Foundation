package _homework03;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 定义一个注解：Book
 * * 包含属性：String value() 书名
 * * 包含属性：double price() 价格，默认值为 100
 * * 包含属性：String[] authors() 多位作者
 * 1. 定义类在成员方法上使用Book注解
 * 2. 解析获得该成员方法上使用注解的属性值。
 *
 * @author Gavin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Book {
    String value();

    double price() default 100;

    String[] authors();
}

class TestBook {
    @Test
    public void testBook() throws NoSuchMethodException {
        Class c = Bookstore.class;
        Method method = c.getDeclaredMethod("sellBook");
        if (method.isAnnotationPresent(Book.class)) {
            Book book = method.getDeclaredAnnotation(Book.class);
            System.out.println("book.value() = " + book.value());
            System.out.println("book.price() = " + book.price());
            System.out.println("Arrays.toString(book.authors()) = "
                    + Arrays.toString(book.authors()));
        }
    }
}

class Bookstore{
    @Book(value = "Mybatis", price = 55.55, authors = {"Morrison", "Trump"})
    public void sellBook() {
    }

}
