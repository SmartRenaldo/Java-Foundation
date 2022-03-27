import org.junit.jupiter.api.Test;

/**
 * 测试：匹配cat，cut，chart和conduct
 *
 * @author gavin
 */
public class Demo10 {
    @Test
    public void testMatch() {
        match("cat");
        match("cut");
        match("chart");
        match("conduct");
        match("count");
    }

    private void match(String input) {
        if (input.matches("c(a|u|har|onduc)t")) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
