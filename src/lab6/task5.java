package lab6;
//5. Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + n^2.
// Число n передается аргументом методу.
//Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=n(n+1)*(2n + 1)/6
class Lab6Task5 {
    public static int summ (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

}

public class task5 {
    public static void main(String[] args) {
        int n=11;
        System.out.println("Сумма квадратов посчитанная в методе =: " + Lab6Task5.summ(n));
        int check = n*(n + 1)*(2 * n + 1) / 6;
        System.out.println("Сумма квадратов по формуле для проверки =: " + check);
    }
}
