package lab10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddFindDelXML {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab10\\example1\\example1.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Найти книги по автору");
            System.out.println("3. Найти книги по году издания");
            System.out.println("4. Удалить книгу");
            System.out.println("5. Выйти");
            System.out.print("Ваш выбор: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook(doc, scanner);
                    break;
                case "2":
                    findBooksByAuthor(doc, scanner);
                    break;
                case "3":
                    findBooksByYear(doc, scanner);
                    break;
                case "4":
                    deleteBook(doc, scanner);
                    break;
                case "5":
                    quit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }

        // Сохраняем изменения в файле
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(file));
        transformer.transform(source, result);

        scanner.close();
    }

    private static void addBook(Document doc, Scanner scanner) throws Exception {
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        String year = scanner.nextLine();

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

        Element root;
        root = doc.getDocumentElement();
        root.appendChild(newBook);
        System.out.println("Книга успешно добавлена.");
    }

    private static void findBooksByAuthor(Document doc, Scanner scanner) {
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        NodeList books = doc.getElementsByTagName("book");

        List<Element> matchedBooks = new ArrayList<>();

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();
            if (bookAuthor.equalsIgnoreCase(author)) {
                matchedBooks.add(book);
            }
        }

        if (matchedBooks.size() == 0) {
            System.out.println("Книги с автором " + author + " не найдены.");
        } else {
            System.out.println("Книги с автором " + author + ":");
            for (Element book : matchedBooks) {
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();
                String year = book.getElementsByTagName("year").item(0).getTextContent();
                System.out.println("- " + title + " (" + bookAuthor + ", " + year + ")");
            }
        }
    }

    private static void findBooksByYear(Document doc, Scanner scanner) {
        System.out.println("Введите год издания книги:");
        String year = scanner.nextLine();
        NodeList books = doc.getElementsByTagName("book");

        List<Element> matchedBooks = new ArrayList<>();

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookYear = book.getElementsByTagName("year").item(0).getTextContent();
            if (bookYear.equalsIgnoreCase(year)) {
                matchedBooks.add(book);
            }
        }

        if (matchedBooks.size() == 0) {
            System.out.println("Книги, выпущенные в " + year + " году, не найдены.");
        } else {
            System.out.println("Книги, выпущенные в " + year + " году:");
            for (Element book : matchedBooks) {
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();
                String bookYear = book.getElementsByTagName("year").item(0).getTextContent();
                System.out.println("- " + title + " (" + bookAuthor + ", " + bookYear + ")");
            }
        }
    }

    private static void deleteBook(Document doc, Scanner scanner) throws Exception {
        System.out.println("Введите название книги, которую нужно удалить:");
        String title = scanner.nextLine();

        NodeList books = doc.getElementsByTagName("book");
        boolean deleted = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();
            if (bookTitle.equalsIgnoreCase(title)) {
                book.getParentNode().removeChild(book);
                deleted = true;
            }
        }

        if (deleted) {
            System.out.println("Книга " + title + " удалена из библиотеки.");
        } else {
            System.out.println("Книга " + title + " не найдена в библиотеке.");
        }
    }
}

