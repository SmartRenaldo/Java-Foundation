package _06XPath检索XML中的信息;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 目标：XPath检索XML中的信息啊。
 * <p>
 * 引入：
 * Dom4J可以用于解析整个XML的数据。
 * 但是如果要检索XML中的某些信息，建议使用XPath.
 * XPath使用步骤：
 * 1.导入dom4j框架。（XPath依赖于Dom4j技术,必须先倒入dom4j框架！）
 * 2.导入XPath独有的框架包。jaxen-1.1.2.jar
 * XPath常用API:
 * List<Node> selectNodes(String var1):检索出一批节点集合。
 * Node selectSingleNode(String var1)：检索出一个节点返回。
 * XPath提供的四种检索数据的写法：
 * 1.绝对路径。
 * 2.相对路径。
 * 3.全文搜索。
 * 4.属性查找。
 * <p>
 * 小结：
 * 1.绝对路径： /根元素/子元素/子元素。
 * 2.相对路径： ./子元素/子元素。 (.代表了当前元素)
 * 3.全文搜索：
 * //元素  在全文找这个元素
 * //元素1/元素2  在全文找元素1下面的一级元素2
 * //元素1//元素2  在全文找元素1下面的全部元素2
 * 4.属性查找。
 * //@属性名称  在全文检索属性对象。
 * //元素[@属性名称]  在全文检索包含该属性的元素对象。
 * //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
 */
public class XPathDemo {
    //  1.绝对路径： /根元素/子元素/子元素
    @Test
    public void testAbsolutePath() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("xml\\contacts.xml");
        //使用绝对路径定位全部的name名称
        List<Node> names = document.selectNodes("/contacts/contact/name");
        for (Node name : names) {
            //打印name的内容
            System.out.println("name.getText() = " + name.getText());
        }
    }

    //  2.相对路径： ./子元素/子元素。 (.代表了当前元素)
    @Test
    public void testContentPath() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("xml\\contacts.xml");
        Element root = document.getRootElement();
        List<Node> names = root.selectNodes("./contact/name");
        for (Node name : names) {
            System.out.println("name.getText() = " + name.getText());
        }
    }

    //3.全文搜索：
    //      //元素  在全文找这个元素
    //      //元素1/元素2  在全文找元素1下面的一级元素2
    //      //元素1//元素2  在全文找元素1下面的全部元素2
    @Test
    public void testFullTextSearch() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("xml/contacts.xml");

        //元素  在全文找这个元素
        List<Node> names01 = document.selectNodes("//name");
        for (Node name01 : names01) {
            System.out.println("name01.getText() = " + name01.getText());
        }

        //元素1/元素2  在全文找元素1下面的一级元素2
        List<Node> names02 = document.selectNodes("//contact/name");
        for (Node name02 : names02) {
            System.out.println("name02.getText() = " + name02.getText());
        }

        //元素1//元素2  在全文找元素1下面的全部元素2
        List<Node> names03 = document.selectNodes("//contact//name");
        for (Node name03 : names03) {
            System.out.println("name03.getText() = " + name03.getText());
        }
    }

    //4.属性查找。
    //      //@属性名称  在全文检索属性对象。
    //      //元素[@属性名称]  在全文检索包含该属性的元素对象。
    //      //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
    @Test
    public void testAttrSearch() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("xml/contacts.xml");

        //      //@属性名称  在全文检索属性对象
        List<Node> attrList = document.selectNodes("//@id");
        for (Node attr : attrList) {
            System.out.println(attr.getName() + ": " + attr.getText());
        }

        //      //元素[@属性名称]  在全文检索包含该属性的元素对象
        List<Node> nodes = document.selectNodes("//contact[@id]");
        //将Node强转成Element才能调用elementTextTrim()和elementText()方法
        Element ele;
        for (Node node : nodes) {
            ele = (Element) node;
            System.out.println("ele.elementTextTrim(\"name\") = " + ele.elementTextTrim("name"));
        }
        System.out.println("-------------------");

        //      //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象
        Node node = document.selectSingleNode("//contact[@id=3]");
        ele = (Element) node;
        System.out.println("ele.elementTextTrim(\"name\") = " + ele.elementTextTrim("name"));
    }
}
