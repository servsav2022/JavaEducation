package lab8.task3;
import java.io.*;
import java.util.*;
//Задание 3. Создать проект, позволяющий из одного текстового файла,
// содержащего несколько строк (тип String) заранее подготовленного текста на русском языке
// (Пушкин, Лермонтов или другой российсмки классик на Ваш вкус),
// построчно переписать в другой текстовый файл слова начинающиеся с согласных букв..
//Требования:
//– слова из предложения выделять методом split();
//– в новом файле следует указать номер строки, в которой иско- мые слова находились в исходном файле;
//– для каждой строки указать количество выбранных слов.
public class Main {
    public static void main(String[] args) {
        try {
            File file1 = new File("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab8\\task3\\InputText.txt");
            File file2 = new File("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab8\\task3\\OutputText.txt");
            FileWriter fileWriter = new FileWriter(file2);
            Scanner scanner = new Scanner(file1);
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                int wordsCounter = 0;
                for (String word : words) {
                    char firstLetter = word.toLowerCase().charAt(0);
                    if ( firstLetter == 'б' || firstLetter == 'в' || firstLetter == 'г' ||
                         firstLetter == 'д' || firstLetter == 'ж' || firstLetter == 'з' ||
                         firstLetter == 'й' || firstLetter == 'к' || firstLetter == 'л' ||
                         firstLetter == 'м' || firstLetter == 'н' || firstLetter == 'п' ||
                         firstLetter == 'р' || firstLetter == 'с' || firstLetter == 'т' ||
                         firstLetter == 'ф' || firstLetter == 'х' || firstLetter == 'ц' ||
                         firstLetter == 'ч' || firstLetter == 'ш' || firstLetter == 'щ' ) {
                        fileWriter.write("Строка " + lineNumber + ": " + word + "\n");
                        wordsCounter++;
                    }
                }
                fileWriter.write("Кол-во слов в строке " + lineNumber + ": " + wordsCounter + "\n");
                lineNumber++;
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
