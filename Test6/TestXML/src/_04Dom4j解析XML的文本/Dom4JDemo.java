package _04Dom4j解析XML的文本;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 目标：Dom4j解析XML的文本;
 * <p>
 * Element:
 * String elementText(String name): 可以直接获取当前元素的子元素的文本内容
 * String elementTextTrim(String name): 去前后空格,直接获取当前元素的子元素的文本内容
 * String getText():直接获取当前元素的文本内容。
 * String getTextTrim():去前后空格,直接获取当前元素的文本内容。
 */
public class Dom4JDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("TestXML\\xml\\student.xml");
        Element root = document.getRootElement();

        Element stdEle = root.element("student");

        //直接拿当前student元素下子元素的文本值
        System.out.println("stdEle.elementText(\"name\") = " + stdEle.elementText("name"));
        // 去前后空格
        System.out.println("stdEle.elementTextTrim(\"name\") = " + stdEle.elementTextTrim("name"));
        System.out.println("stdEle.elementText(\"age\") = " + stdEle.elementText("age"));
        System.out.println("stdEle.elementTextTrim(\"age\") = " + stdEle.elementTextTrim("age"));
        System.out.println("stdEle.elementText(\"gender\") = " + stdEle.elementText("gender"));
        System.out.println("stdEle.elementTextTrim(\"gender\") = " + stdEle.elementTextTrim("gender"));

        //拿到student的子元素后再拿其子元素的文本值
        Element name = stdEle.element("name");
        System.out.println("name.getText() = " + name.getText());
        System.out.println("name.getTextTrim() = " + name.getTextTrim());
        Element age = stdEle.element("age");
        System.out.println("age.getText() = " + age.getText());
        System.out.println("age.getTextTrim() = " + age.getTextTrim());
        Element gender = stdEle.element("gender");
        System.out.println("gender.getText() = " + gender.getText());
        System.out.println("gender.getTextTrim() = " + gender.getTextTrim());
    }
}
