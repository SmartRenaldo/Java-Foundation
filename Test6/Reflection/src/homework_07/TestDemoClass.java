package homework_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class TestDemoClass {
    DemoClass demoClass;
    Class c;

    @BeforeEach
    public void init() {
        demoClass = new DemoClass();
        c = DemoClass.class;
    }

    @Test
    public void testRun() {
        try {
            Method run = c.getDeclaredMethod("run");
            run.invoke(demoClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
