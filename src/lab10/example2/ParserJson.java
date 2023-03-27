package lab10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class  ParserJson {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\user\\IdeaProjects\\JavaEducation" +
                    "\\src\\lab10\\example2\\example-json.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray= (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\n Текущий элемент: book");
                System.out.println("Название книги: "+ book.get("title"));
                System.out.println("Автор: "+ book.get("author"));
                System.out.println("Год издания: "+ book.get("year"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
