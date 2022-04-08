package homework11;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 3.1． 训练知识点
 * 1.文件的获取
 * 2.文件的判断
 * 3.递归的使用
 * 3.2． 训练描述
 * 键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
 * 注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
 * 用个数作为value,放入到map集合中,并用两种方式遍历map集合
 * 例如：
 * doc 的类型的文件有 3 个
 * java 的类型的文件有 5 个
 * txt 的类型的文件有 7 个
 */
public class Demo01 {
    public static void main(String[] args) {
        final HashMap<String, Integer> map = getFileType(new File("D:\\2020 semester2\\7202"));

        final Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        Set<Map.Entry<String, Integer>> mapSet = map.entrySet();
        for (Map.Entry<String, Integer> entry : mapSet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }

    private static HashMap<String, Integer> getFileType(File file) {
        final HashMap<String, Integer> map = new HashMap<>();
        getFileType(file, map);
        return map;
    }

    private static void getFileType(File file, HashMap<String, Integer> map) {
        if (file.isDirectory()) {
            final File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isDirectory() || pathname.getName().contains(".")) {
                        return true;
                    }
                    return false;
                }
            });

            for (File f : files) {
                if (f.isFile()) {
                    String key = f.getName().substring(f.getName().lastIndexOf('.') + 1);
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 1);
                    } else map.put(key, 1);
                } else {
                    getFileType(f, map);
                }
            }
        }
    }
/*    public static void getFileType(File f,Map<String,Integer> map) {
        if(f.isDirectory()) {
            File files[] = f.listFiles();
            for (File file : files) {
                getFileType(file,map);
            }
        } else {
            // 获得文件名
            String fileName = f.getName(); // aaa.txt
            // 获得文件扩展名
            String key = fileName.substring(fileName.lastIndexOf(".") + 1); // txt
            // 判断map是否包含key
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1); // txt 2
            } else {
                map.put(key, 1); // txt  1
            }
        }
    }

    *//*
     * 根据用户输入的路径字符串创建文件对象
     *//*
    private static File inputFile() {
        // 创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        // 接收用户输入的路径
        String filePath = sc.nextLine();
        // 根据路径字符串创建文件对象
        File dir = new File(filePath);
        if(!dir.exists()) throw new RuntimeException("你输入的文件路径不存在！！！");
        // 判断是否是文件夹
        if(!dir.isDirectory()){
            throw new RuntimeException("输入的路径不是文件夹路径！！！");
        }
        return dir;
    }*/
}
