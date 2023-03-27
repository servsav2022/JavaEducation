package lab10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class AddFindDelJson {
    private static  void DeleteByTitle (JSONObject jsonObject, Scanner scanner) throws Exception {
        System.out.println("Введите название книги которую хотите удалить:");
        String title = scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        Iterator iterator = jsonArray.iterator();
        boolean founded = true;
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
                founded = false;
                System.out.println("Книга "+title+" удалена из массива");
            }
        }
        if (founded){
            System.out.println("Книги с таким названием не найндено");
        }

    }
    private static  void findByAuthor (JSONObject jsonObject, Scanner scanner) throws Exception {

        System.out.println("Введите автора книги для для поиска:");
        String author = scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        boolean founded = false;
        for (Object obj : jsonArray) {
            JSONObject bookObj = (JSONObject) obj;
            if (bookObj.get("author").equals(author)) {
                founded = true;
                System.out.println();
                System.out.println(bookObj.get("title"));
                System.out.println();
                System.out.println(bookObj.get("author"));
                System.out.println();
                System.out.println(bookObj.get("year"));
                System.out.println();
            }
        }
        if (!founded){
            System.out.println("Книг с таким автором  не найндено");
        }
    }
    private static void addBook(JSONObject jsonObject,Scanner scanner) throws Exception {
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        String year = scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        jsonArray.add(newBook);
        System.out.println("Книга успешно добавлена.");
    }
    public static void main(String[] args) throws Exception {

        String fileName ="C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab10\\example2\\example-json.json";
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(fileName));
        JSONObject jsonObject = (JSONObject) obj;
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while (!quit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Найти книги по автору");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Выйти");
            System.out.print("Ваш выбор: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook(jsonObject, scanner);
                    break;
                case "2":
                    findByAuthor (jsonObject, scanner);
                    break;
                case "3":
                    DeleteByTitle (jsonObject, scanner);
                    break;
                case "4":
                    quit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
        // Сохраняем изменения в файле
        scanner.close();
        FileWriter writer = new FileWriter(fileName);
        writer.write(jsonObject.toJSONString());
        writer.close();
    }
}
