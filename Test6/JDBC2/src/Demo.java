import org.junit.Test;

import java.util.regex.Pattern;

public class Demo {
    @Test
    public void testMatch() {
        System.out.println(matchPhoneNum("891784652343"));
    }

    private boolean matchPhoneNum(String phoneNum) {
        return Pattern.matches("\\d{11}",phoneNum);
    }
}
