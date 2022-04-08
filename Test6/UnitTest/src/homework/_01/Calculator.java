package homework._01;

import java.math.BigDecimal;

/**
 * 1. 案例01：Junit单元测试
 * 1.1 需求说明
 * 1. 设置一个类Calculator，包含4个方法：加、减、乘、除，使用JUnit对4个方法进行单元测试。
 * 2. 在每个方法运行之前创建Calculator对象，在测试方法运行完毕之后将对象设置为null 。
 */
public class Calculator {
    public double add(double num1, double num2){
        BigDecimal num1BD = BigDecimal.valueOf(num1);
        BigDecimal num2BD = BigDecimal.valueOf(num2);
        return num1BD.add(num2BD).doubleValue();
    }

    public double subtract(double num1,double num2){
        BigDecimal num1BD = BigDecimal.valueOf(num1);
        BigDecimal num2BD = BigDecimal.valueOf(num2);
        return num1BD.subtract(num2BD).doubleValue();
    }

    public double multiply(double num1, double num2){
        BigDecimal num1BD = BigDecimal.valueOf(num1);
        BigDecimal num2BD = BigDecimal.valueOf(num2);
        return num1BD.multiply(num2BD).doubleValue();
    }

    public double divide(double num1, double num2){
        BigDecimal num1BD = BigDecimal.valueOf(num1);
        BigDecimal num2BD = BigDecimal.valueOf(num2);
        return num1BD.divide(num2BD, 2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
