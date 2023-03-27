package lab10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AddBook {

    public static void main(String[] args) throws Exception {
        // Открываем XML-файл
        File file = new File("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab10\\example1\\example1.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);

        // Запрашиваем у пользователя информацию о новой книге
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        String year = scanner.nextLine();
        scanner.close();

        // Создаем новый элемент книги
        Element newBook = doc.createElement("book");

        Element newTitle = doc.createElement("title");
        newTitle.setTextContent(title);
        newBook.appendChild(newTitle);

        Element newAuthor = doc.createElement("author");
        newAuthor.setTextContent(author);
        newBook.appendChild(newAuthor);

        Element newYear = doc.createElement("year");
        newYear.setTextContent(year);
        newBook.appendChild(newYear);

        // Добавляем новую книгу в документ
        Element root = doc.getDocumentElement();
        root.appendChild(newBook);

        // Сохраняем изменения в файле
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(file));
        transformer.transform(source, result);
    }
}


