package _14注解解析;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 目标：注解的解析
 * <p>
 * 我们会使用注解注释一个类的成分，那么就设计到要解析出这些注解的数据。
 * 开发中经常要知道一个类的成分上面到底有哪些注解，注解有哪些属性数据，这都需要进行注解的解析。
 * <p>
 * 与注解解析相关的接口
 * 1. Annotation: 注解类型，该类是所有注解的父类。注解都是一个Annotation的对象
 * 2. AnnotatedElement:该接口定义了与注解解析相关的方法
 * 所有的类成分Class, Method , Field , Constructor:都实现了AnnotatedElement接口
 * 他们都拥有解析注解的能力：
 * a.Annotation[]	getDeclaredAnnotations()
 * 获得当前对象上使用的所有注解，返回注解数组。
 * b.T getDeclaredAnnotation(Class<T> annotationClass)
 * 根据注解类型获得对应注解对象
 * c.boolean isAnnotationPresent(Class<Annotation> annotationClass)
 * 判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false
 * <p>
 * 解析注解数据的原理
 * * 注解在哪个成分上，我们就先拿哪个成分对象。
 * * 比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
 * * 比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
 * * 比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解
 * <p>
 * 需求：（了解即可）
 * 1. 定义注解Book，要求如下：
 * - 包含属性：String value()   书名
 * - 包含属性：double price()  价格，默认值为 100
 * - 包含属性：String[] authors() 多位作者
 * - 限制注解使用的位置：类和成员方法上
 * - 指定注解的有效范围：RUNTIME
 * 2. 定义BookStore类，在类和成员方法上使用Book注解
 * 3. 定义AnnotationDemo01测试类获取Book注解上的数据
 */
public class AnnotationDemo {
    @Test
    public void parseClass() {
        // 1.定位Class类对象
        Class c = BookStore.class;
        // 2.判断这个类上是否使用了某个注解
        if (c.isAnnotationPresent(Book.class)) {
            // 3.获取这个注解对象
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println("book.value() = " + book.value());
            System.out.println("book.price() = " + book.price());
            System.out.println("Arrays.toString(book.authors()) = "
                    + Arrays.toString(book.authors()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = BookStore.class;
        Method method = c.getMethod("run");
        if (method.isAnnotationPresent(Book.class)) {
            Book book = method.getDeclaredAnnotation(Book.class);
            System.out.println("book.value() = " + book.value());
            System.out.println("book.price() = " + book.price());
            System.out.println("Arrays.toString(book.authors()) = "
                    + Arrays.toString(book.authors()));
        }
    }
}

@Book(value = "Introduction to JAVA", price = 55.55, authors = {"Morrison", "Johnson"})
class BookStore {
    @Book(value = "Mybatis", authors = {"Sam"})
    public void run() {
    }
}

/**
 * @author Gavin
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    String value();

    double price() default 100;

    String[] authors();
}
