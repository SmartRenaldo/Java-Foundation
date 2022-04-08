package homework_07;

import java.io.PrintStream;
import java.util.Properties;

public class SetProporties {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("Reflection\\src\\homework_07\\config.properties")) {
            Properties props = new Properties();
            props.setProperty("Kally", "17");
            props.setProperty("Kate", "58");
            props.setProperty("Rowling", "55");
            props.store(ps, "name and age");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
