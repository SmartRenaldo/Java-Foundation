package _03Dom4j解析XML的属性;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 目标：Dom4j解析XML的属性;
 * <p>
 * Element元素的API:
 * List<Attribute> attributes(): 获取元素的全部属性对象。
 * Attribute attribute(String name):根据名称获取某个元素的属性对象。
 * String attributeValue(String var1):直接获取某个元素的某个属性名称的值。
 * <p>
 * Attribute对象的API:
 * String getName():  获取属性名称。
 * String getValue(): 获取属性值。
 */

public class Dom4JDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("TestXML\\xml\\student.xml");

        Element root = document.getRootElement();

        //获取根元素下的第一个student元素
        Element stdEle = root.element("student");

        //获取根元素下第一个student元素的属性集合
        List<Attribute> attributes = stdEle.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName() + ": " + attribute.getValue());
        }

        //获取class属性对象
        Attribute classAttr = stdEle.attribute("class");
        System.out.println(classAttr.getName() + ": " + classAttr.getValue());

        //直接获取第一个student元素的属性值
        System.out.println("stdEle.attributeValue(\"class\") = " + stdEle.attributeValue("class"));
        System.out.println("stdEle.attributeValue(\"grade\") = " + stdEle.attributeValue("grade"));
    }
}
