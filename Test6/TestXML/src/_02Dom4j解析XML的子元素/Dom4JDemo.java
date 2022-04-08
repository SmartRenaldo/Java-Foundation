package _02Dom4j解析XML的子元素;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 目标：Dom4j解析XML的子元素
 * Element元素的API:
 * String getName():取元素的名称。
 * List<Element> elements():获取当前元素下的全部子元素（一级）
 * List<Element> elements(String name):获取当前元素下的指定名称的全部子元素（一级）
 * Element element(String name):获取当前元素下的指定名称的某个子元素，默认取第一个（一级）
 */
public class Dom4JDemo {
    public static void main(String[] args) throws DocumentException {
        // 需求：解析books.xml文件成为一个Document文档树对象，得到根元素对象。
        // 1.创建一个dom4j的解析器对象：代表整个dom4j框架。
        SAXReader saxReader = new SAXReader();

        // 通过解析器对象去加载xml文件数据，成为一个Document文档树对象。
        Document document = saxReader.read("TestXML\\xml\\student.xml");

        // 3.获取根元素对象
        Element root = document.getRootElement();
        System.out.println("root.getName() = " + root.getName());

        // 4.获取根元素下的全部子元素
        List<Element> sonElements = root.elements();
        for (Element sonElement : sonElements) {
            System.out.println("sonElement.getName() = " + sonElement.getName());
        }

        // 5.获取根源下的全部students子元素
        List<Element> sonElements2 = root.elements("student");
        for (Element sonElement2 : sonElements2) {
            System.out.println("sonElement2.getName() = " + sonElement2.getName());
        }

        // 6.获取根源下的指定的某个元素
        Element son = root.element("student");
        System.out.println("son.getName() = " + son.getName());

        // 默认会提取第一个名称一样的子元素对象返回！
        Element son1 = root.element("student");
        System.out.println("son1.attributeValue(\"number\") = " + son1.attributeValue("number"));
    }
}
