import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        checkEmail();
        //checkTel();
        //checkPhone();
    }

    //Java 的正则表达式在匹配点(.)  和斜杠(\)，表达式要分别写作 \\. 和 \\\\。
    // 匹配点(.) 或  {、[、(、?、$、^ 和 * 这些特殊符号要要前加双斜框，匹配 \ 时要用四斜杠，这确实能让你包走天涯的。
    private static void checkEmail(){
        System.out.println("Please enter e-mail:");
        Scanner sc = new Scanner(System.in);
        String emailStr = sc.nextLine();
        //emailStr.matches("\\w{1,}@\\w{2,10}(\\.w{1,}){1,2}")        24iksfg924@qq.com.cn
        if(emailStr.matches("\\w{1,}@\\w{2,10}\\.com")){
            System.out.println("The format is correct!");
        }else{
            System.err.println("The format is incorrect!");
        }
    }

    private static void checkTel(){
        System.out.println("Please enter telephone number:");
        Scanner sc = new Scanner(System.in);
        String telStr = sc.next();
        if(telStr.matches("1[3-9]\\d{9}")){
            System.out.println("The format is correct!");
        }else{
            System.err.println("The format is incorrect!");
        }
    }

    private static void checkPhone(){
        //020-123455678
        //02012345678
        System.out.println("Please enter phone number:");
        Scanner sc = new Scanner(System.in);
        String phoneStr = sc.next();
        if(phoneStr.matches("0\\d{2,3}-?\\d{7,8}")){
            System.out.println("The format is correct!");
        }else{
            System.err.println("The format is incorrect!");
        }
    }
}
