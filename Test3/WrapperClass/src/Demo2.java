public class Demo2 {
    /*
        包装类的特有功能

        包装类作为一个类是存在API功能的。
                1.可以把基本数据类型的值转换成字符串。(没啥用)。
                2.可以把字符串类型的数值转换成对应的基本数据类型（很有用了,重点）
        Xxxx parseXxxx(“字符串类型的数值”)
        Xxxx valueOf(“字符串类型的数值”):建议方式
        小结：

                包装类可以把字符串类型的数值转换成对应的基本数据类型的值。
                */
    public static void main(String[] args) {
        // 1.可以调用toString()方法，把类型转换成字符串(没啥用)
        Integer it = 12;
        String str = it.toString();
        System.out.println(str + 1);

        // 2.直接+字符串变成字符串(没啥用)
        String str2 = it + "";
        System.out.println(str2);

        // 3.调用Integer.toString方法得到字符串(没啥用)
        String str3 = Integer.toString(it);
        System.out.println(str3 + 11);

        //可以把字符串类型的数值转换成对应的基本数据类型（很有用了,重点）
        // 把字符串类型的整数转换成整数类型的数值。
        //int numInt = Integer.parseInt(num);
        String str1 = "100";
        int i = Integer.parseInt(str);      //已淘汰
        int ii = Integer.parseInt(str);
        System.out.println(ii + 1);

        // 把字符串小数转换成对应的double类型的值。
        //double priceDb = Double.parseDouble(price);
        String strDb = "99.9";
        double doubleDb = Double.parseDouble(strDb);        //已淘汰
        double dd = Double.valueOf(strDb);
        System.out.println(dd + 0.1);

        String strFl = "842sr";
        Double ddddd = Double.valueOf(strFl);
        System.out.println(ddddd);      //NumberFormatException
    }
}
