package lab10.example4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();


            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div >table > "+
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > "+
                            "tr > td:nth-child(1)");

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)){
                    List<Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("тема : "+
                            ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));

                    System.out.println("дата : "+
                            ((Element) nodes.get(i)).getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
