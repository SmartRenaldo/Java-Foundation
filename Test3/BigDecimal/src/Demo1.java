import java.math.BigDecimal;

public class Demo1 {
    /*    目标：大数据处理类：BigDecimal
        引入：

                 double类型的数据在运算的时候并不精确，可能出现数据失真。
                 此时就可以用BigDecimal解决。
        BigDecimal作用：

        可以解决浮点数的精确计算。
        public static BigDecimal valueOf(double val):直接把浮点型包装成大数据对象。
        public BigDecimal add(BigDecimal value); 加法
        public BigDecimal subtract(BigDecimal value); 减法
        public BigDecimal multiply(BigDecimal value); 乘法
        public BigDecimal divide(BigDecimal value); 除法
        public double doubleValue():把BigDecimal的数据转换成double类型。*/
    public static void main(String[] args) {
        System.out.println(0.2 + 0.1);
        System.out.println(1 - 0.32);
        System.out.println(0.09 + 0.01);
        System.out.println(1.005 * 100);
        System.out.println(1.301 / 100);

        // 把a包装成大数据对象
        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal b1 = BigDecimal.valueOf(0.2);
        BigDecimal rsut1 = a1.add(b1);
        System.out.println(rsut1);

        // 最终还是把大数据计算出的精确结果转换回double类型。
        double rs1 = rsut1.doubleValue();
        System.out.println(rs1);

        BigDecimal a2 = BigDecimal.valueOf(1);
        BigDecimal b2 = BigDecimal.valueOf(0.32);
        BigDecimal rsut2 = a2.subtract(b2);
        System.out.println(rsut2);

        double rs2 = rsut2.doubleValue();
        System.out.println(rs2);

        BigDecimal a3 = BigDecimal.valueOf(0.09);
        BigDecimal b3 = BigDecimal.valueOf(0.01);
        BigDecimal rsut3 = a3.add(b3);
        double rs3 = rsut3.doubleValue();
        System.out.println(rs3);

        BigDecimal a4 = BigDecimal.valueOf(0.01);
        BigDecimal b4 = BigDecimal.valueOf(79.4);
        BigDecimal rstu4 = a4.multiply(b4);
        double rs4 = rstu4.doubleValue();
        System.out.println(rs4);

        BigDecimal a5 = BigDecimal.valueOf(1.301);
        BigDecimal b5 = BigDecimal.valueOf(100);
        BigDecimal rsut5 = a5.divide(b5);
        double rs5 = rsut5.doubleValue();
        System.out.println(rs5);
    }
}
