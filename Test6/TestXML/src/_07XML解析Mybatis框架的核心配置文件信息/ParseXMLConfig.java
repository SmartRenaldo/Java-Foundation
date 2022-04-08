package _07XML解析Mybatis框架的核心配置文件信息;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ParseXMLConfig {
    @Test
    public void parseXML() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("xml/sqlMaping.xml");
        Element root = document.getRootElement();
        Element environments = root.element("environments");
        Element environment = environments.element("environment");
        Element dataSource = environment.element("dataSource");
        List<Element> properties = dataSource.elements();
        for (Element property : properties) {
            System.out.println(property.attributeValue("name") + ": " + property.attributeValue("value"));
        }
    }
}
