import org.junit.jupiter.api.Test;

public class Demo14 {
    @Test
    public void test(){
        String s = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";

        //split方法返回String[]数组，元素为拆分后的对象
        String[] arr = s.split(" ");

        for (String ele : arr) {
            System.out.println(ele);
        }
    }

    @Test
    public void test2(){
        String s = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";

        //limit：返回的子字符串个数
        String[] arr = s.split(" ", 2);

        for (String ele : arr) {
            System.out.println(ele);
        }
    }
}
