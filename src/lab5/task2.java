package lab5;


//2. Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов.
// При вызове метод выводит в консольное окно все символы из кодовой таблицы,
// которые находятся «между» символами,
// являющимися значениями полей объекта (из которого вызывается метод).
// Например, если полям объекта присвоены значения ‘A’ и ‘D’,
// то при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.
class MyClassTask2 {
    char chr1;
    char chr2;
    public void setChr1(char chr1, char chr2) {
        this.chr1 = chr1;
        this.chr2 = chr2;
    }
    public void showSymbols() {
        int ch1= (int) this.chr1;
        int ch2= (int) this.chr2;
        if (ch1>ch2) {
            System.out.println("Второй символ должен быть дальше чем первый по алфавиту");
        }else if (ch1<ch2){
            for (int i = ch1; i <=ch2 ; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
public class task2 {
    public static void main(String[] args) {
        MyClassTask2 classTask2 =new MyClassTask2();
        classTask2.setChr1('A', 'Z');
        classTask2.showSymbols();
    }
}
