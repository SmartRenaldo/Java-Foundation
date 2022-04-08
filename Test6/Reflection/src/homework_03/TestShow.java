package homework_03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class TestShow {
    @Test
    public void testShow() throws Exception {
        Class c = ShowClass.class;
        Method showM = c.getDeclaredMethod("show");
        showM.invoke(new ShowClass());
    }
}
