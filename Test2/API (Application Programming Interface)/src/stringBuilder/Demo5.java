package stringBuilder;

public class Demo5 {
    public static void main(String[] args) {

        //调用append方法，返回的是对象自己

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("abc");
        StringBuilder sb3 = sb1.append("12 3");
        System.out.println(sb1);

        System.out.println(sb1 == sb2);
        System.out.println(sb2 == sb3);

        StringBuilder sb4 = new StringBuilder();
        sb4.append("abc").append("12 3");
        System.out.println(sb4);
        System.out.println(sb1 == sb4);
        System.out.println(sb1.equals(sb4));
    }
}
