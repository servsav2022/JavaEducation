package lab4;
//
//8. Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
// При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования»,
// после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
// Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
// если пользователь вводит «y», тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
// Если пользователь вводит что-то другое, отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».
//
import java.util.Arrays;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        char[] chars =text.toCharArray();
        int[] ints = new int[text.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i]=chars[i]+key;
        }
        System.out.println("chars до преобразования: " + Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            chars[i]=(char) ints[i];
        }
        System.out.println("chars после преобразования: " + Arrays.toString(chars));
        String text2 =new String(chars);
        System.out.println("Текст после преобразования: " + text2);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while(true){
            String otvet = in.next();
            if ('y'==otvet.charAt(0)){
                System.out.println("Текст после обратного преобразования: ");

                chars =text2.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    ints[i]=chars[i]-key;
                    chars[i]=(char) ints[i];
                }
                System.out.println("chars после обратного преобразования: " + Arrays.toString(chars));
                String text3 =new String(chars);
                System.out.println("Текст после преобразования: " + text3);

                break;
            } else if (otvet.charAt(0)=='n') {
                System.out.println("No До Свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

    }
}
