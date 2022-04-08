package _05Dom4j解析案例;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：Dom4j解析XML文件:Contacts.xml成为一个Java的对象（集合对象）
 * <p>
 * Contacts.xml 解析成===> List<Contact>
 * <p>
 * 分析：
 * 1.定义一个联系人类封装联系人数据。
 * 2.解析成List集合。
 */
public class Dom4JDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("TestXML\\xml\\contacts.xml");
        Element root = document.getRootElement();

        //拿到contact元素对象集合
        List<Element> elements = root.elements();

        //建立联系人列表
        List<Contact> contacts = new ArrayList<>();

        if (elements != null && elements.size() > 0) {
            //element为每一个contact
            for (Element element : elements) {
                Contact contact = new Contact();

                contact.setId(Integer.parseInt(element.attributeValue("id")));
                contact.setVip(Boolean.parseBoolean(element.attributeValue("vip")));
                contact.setName(element.elementTextTrim("name"));
                contact.setGender(element.elementTextTrim("gender").charAt(0));
                contact.setEmail(element.elementTextTrim("email"));

                contacts.add(contact);
            }
        }

        contacts.forEach(System.out::println);
    }
}
