package lab8.task2;
import java.io.*;
import java.util.Scanner;
// Задание 2. Создать проект, позволяющий из одного,
// предварительно созданного программными средствами файла, переписать данные,
// соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
// В результирующий файл переписать вторую строку и положительные числа.
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab8\\task2\\MyFile1.txt");
        Scanner sc = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("C:\\Users\\user\\IdeaProjects\\JavaEducation\\src\\lab8\\task2\\MyFile2.txt");
        String line;
        double number;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
                if (number > 0) {
                    fileWriter.write(line + "\n");
                    fileWriter.write(Double.toString(number) + "\n");
                }
            }
        }
        sc.close();
        fileWriter.close();
    }
}
