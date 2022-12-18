package lab4;

import java.util.Arrays;
import java.util.Scanner;
//
//9* (дополнительная задача).
// Напишите программу «Шифр Цезаря»,
// в которой необходимо реализовать собственный алфавит,
// остальные условия идентичны задаче 8.
//

public class task9 {
    public static void main(String[] args) {
        char alfavit[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
                ' ','А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О',
                'П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        char[] chars =text.toCharArray();
        System.out.println("chars до преобразования: " + Arrays.toString(chars));

        int[] myCharCode=new int[text.length()];
        char[] charsEncode =chars;

        for (int i = 0; i < text.length() ; i++) {
            for (int j = 0; j < 67; j++) {
                if (chars[i]==alfavit[j]){
                    myCharCode[i]=j+key;
                    charsEncode[i]= (char) myCharCode[i];
                }
            }
        }
        System.out.println();
        System.out.println("chars зашифрованный по моему алфавиту: " + Arrays.toString(charsEncode));

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while(true){
            String otvet = in.next();
            if ('y'==otvet.charAt(0)){

                System.out.println("Дешифрование по моему алфавиту: ");
                for (int i = 0; i < charsEncode.length ; i++) {
                    System.out.print(alfavit[((int) charsEncode[i])-key]);
                }
                System.out.println();
                break;
            } else if (otvet.charAt(0)=='n') {
                System.out.println("До Свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
