package _11Base64;

import java.util.Base64;
import java.util.UUID;

/**
 * 目标: https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&
 * wd=%E9%BB%91%E9%A9%AC%E7%A8%8B%E5%BA%8F%E5%91%98&rsv_pq=adb2aafb0004cea1&rsv_t=bd43rF5NublIew4JRzSmtNoJ2Dtx8lMAuD4NgJOFnkKoA98JL9hZ8DvnSJI&rqlang=cn&rsv_enter=0&rsv_dl=tb
 * <p>
 * Base64可以实现编码和解码。
 * Java 8 内置了 Base64 编码的编码器和解码器。
 * <p>
 * encode: 编码。
 * decode: 解码。
 */
public class Base64Demo {
    public static void main(String[] args) {
        String str1 = Base64.getEncoder().encodeToString("好好学编程".getBytes());
        System.out.println("str1 = " + str1);
        byte[] buffer1 = Base64.getDecoder().decode(str1);
        System.out.println(new String(buffer1));

        String str2 = Base64.getUrlEncoder().encodeToString("?loginNaame=Gavin&password=123123".getBytes());
        System.out.println("str2 = " + str2);
        byte[] buffer2 = Base64.getUrlDecoder().decode(str2);
        System.out.println(new String(buffer2));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(UUID.randomUUID().toString());
        }
        String str3 = Base64.getMimeEncoder().encodeToString(sb.toString().getBytes());
        System.out.println("str3 = " + str3);
        byte[] buffer3 = Base64.getMimeDecoder().decode(str3);
        System.out.println(new String(buffer3));
    }
}
