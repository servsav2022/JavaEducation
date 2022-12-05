package lab3;

//7. Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.

public class task7 {
    public static void main(String[] args) {

        int size=10; // размер символьного массива по условию задается переменной
        char[] masChar=new char[size];
        byte b1 = 97;    // 97 это буква a в ascii иtf-8
        for (int i = 0; i < size ; i++) {
            char ch1 = (char) b1;    // перевожу байт в чар
            masChar[i]=ch1;    //заполняю массив
            if (ch1=='y'){    //проверяю не дошел ли последней буквы в последовательности через букву в англ. алфавите
                b1=95;      //если дошел то возвращаю значение байт на предшествующие на 2 единицы от 97 или буква a
            }
            b1++; // не нашел другого способа увеличть байт на 2
            b1++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(masChar[i]+" ");
        }
        System.out.println();
        for (int i = size-1; i>=0; i=i-1) {
            System.out.print(masChar[i]+" ");
        }
    }
}