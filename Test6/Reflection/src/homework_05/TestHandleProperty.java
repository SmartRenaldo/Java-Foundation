package homework_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestHandleProperty {
    private Dog dog;
    private Class dogC;
    private Field dogF;
    private Class handlePropertyC;
    private HandleProperty handleProperty;

    @BeforeEach
    public void init() throws NoSuchFieldException {
        dog = new Dog();
        dogC = dog.getClass();
        dogF = dogC.getDeclaredField("name");
        handlePropertyC = HandleProperty.class;
        handleProperty = new HandleProperty();
    }

    @Test
    public void testSetProperty() {
        try {
            Method setProperty = handlePropertyC.getDeclaredMethod(
                    "setProperty", Object.class, String.class, Object.class);
            setProperty.invoke(handleProperty, dog, "name", "Akin");
            Method getName = dogC.getDeclaredMethod("getName");
            System.out.println("getName.invoke(dog) = " + getName.invoke(dog));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetProperty() {
        try {
            Method setName = dogC.getDeclaredMethod("setName", String.class);
            setName.invoke(dog, "Milo");
            Method getProperty = handlePropertyC.getDeclaredMethod("getProperty", Object.class, String.class);
            System.out.println("getProperty.invoke(handleProperty, dog, \"name\") = "
                    + getProperty.invoke(handleProperty, dog, "name"));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
