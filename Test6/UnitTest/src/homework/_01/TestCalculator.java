package homework._01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @AfterEach
    public void close() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        System.out.println("calculator.add(3,5.01) = " + calculator.add(3, 5.01));
    }

    @Test
    public void testSubtract() {
        System.out.println("calculator.subtract(4,8) = " + calculator.subtract(4, 8));
    }

    @Test
    public void testMultiply() {
        System.out.println("calculator.multiply(3,9.9) = " + calculator.multiply(3, 9.9));
    }

    @Test
    public void  testDivide(){
        System.out.println("calculator.divide(4,13) = " + calculator.divide(4, 13));
    }
}
