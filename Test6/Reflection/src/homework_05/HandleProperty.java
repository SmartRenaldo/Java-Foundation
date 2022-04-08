package homework_05;

import java.lang.reflect.Field;

/**
 * 6. 案例06：反射案例5
 * 6.1 需求说明
 * 按要求完成下面两个方法的方法体
 * 写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.
 * public void setProperty(Object obj, String propertyName, Object value){
 * }
 * 写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
 * public Object getProperty(Object obj, String propertyName){
 * }
 */
public class HandleProperty {
    public void setProperty(Object obj, String propertyName, Object value) {
        Class c = obj.getClass();
        try {
            Field f = c.getDeclaredField(propertyName);
            f.setAccessible(true);
            f.set(obj, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Object getProperty(Object obj, String propertyName) throws Exception {
        Class c = obj.getClass();
        Field f = c.getDeclaredField(propertyName);
        f.setAccessible(true);
        return f.get(obj);
    }
}
