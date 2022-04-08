package homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ParseBook {
    @Test
    public void testParseBook() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src\\homework\\book.xml");

        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        List<Book> books = new ArrayList<>();

        if (elements != null && elements.size() > 0) {
            for (Element element : elements) {
                Book book = new Book();
                book.setCategory(element.attributeValue("category"));
                book.setTitle(element.elementTextTrim("title"));
                book.setAuthor(element.elementTextTrim("author"));
                book.setPrice(Double.parseDouble(element.elementTextTrim("price")));
                book.setYear(Integer.parseInt(element.elementTextTrim("year")));

                books.add(book);
            }
        }

        books.forEach(System.out::println);
    }
}
