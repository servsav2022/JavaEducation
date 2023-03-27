package lab10.example4;
// Доработанный пример с проверкой подключения к сайту и сохраненинем в файл
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;

public class NewsParserWithChecks {
    public static void main(String[] args) {
        final int MAX_RETRIES = 5;
        final int RETRY_DELAY_MS = 5000;
        int numRetries = 0;
        boolean connected = false;

        while (numRetries < MAX_RETRIES && !connected) {
            try {
                URL url = new URL("http://fat.urfu.ru/index.html");
                // проверка подключения к сайту
                Connection.Response response = Jsoup.connect(url.toString()).execute();
                int statusCode = response.statusCode();
                if (statusCode == 200) {
                    System.out.println("Подключение к сайту " + url.toString() + " выполнено успешно!");
                    connected = true;
                } else {
                    System.out.println("Ошибка подключения к сайту " + url.toString() + " (статус: " + statusCode + ")");
                    numRetries++;
                    Thread.sleep(RETRY_DELAY_MS);
                }
            } catch (HttpStatusException e) {
                System.out.println("Ошибка подключения к сайту: " + e.getMessage());
                numRetries++;
                try {
                    Thread.sleep(RETRY_DELAY_MS);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

        if (!connected) {
            System.out.println("Не удалось подключиться к сайту после " + MAX_RETRIES + " попыток");
            return;
        }

        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div >table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            // запись вывода программы в файл
            File outputFile = new File("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab10\\example4\\output.txt");
            PrintStream printStream = new PrintStream(outputFile);

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)){
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String topic = ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();
                    String date = ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();

                    // вывод в консоль и запись в файл
                    printStream.println("тема : " + topic);
                    printStream.println("дата : " + date + "\n");
                    System.out.println("тема : " + topic);
                    System.out.println("дата : " + date + "\n");
                }
            }
            printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}