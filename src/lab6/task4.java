package lab6;
//4. Напишите программу, в которой описан статический метод для вычисления двойного факториала числа,
// переданного аргументом методу. По определению, двойной факториал числа п (обозначается как n!!)
// — это произведение через одно всех чисел, не больших числа п.
// То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п и равен 2 для четного n).
// Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.

class Lab6Task4 {
    public static int factorTwo (int n){
        int fact = n;
        int a = n;
        for( int i=n; i>2; i-=2 ){
            a = a-2;
            fact *= a;
        }
        return fact;
    }
}
public class task4 {
    public static void main(String[] args) {
        System.out.println(Lab6Task4.factorTwo(6));
        System.out.println(Lab6Task4.factorTwo(5));
    }
}
