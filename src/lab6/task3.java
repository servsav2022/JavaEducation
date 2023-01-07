package lab6;
//3. Напишите программу с классом, в котором есть статические методы,
// которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив).
// Методы, на основании переданных аргументов или массива,
// позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.
class Lab6Task3 {
    public static void maxMethod(int ... arrs) {
        int max = arrs[0];
        for (int i =0; i<arrs.length; i++) {
            max = Math.max(max, arrs[i]);
        }
        System.out.println("наибольшее значение = "+max);
    }
    public static void minMethod(int ... arrs) {
        int min = arrs[0];
        for (int i =0; i<arrs.length; i++) {
            min = Math.min(min, arrs[i]);
        }
        System.out.println("наименьшее значение = "+min);
    }
    public static void avgMethod(int ... arrs) {
        int sum = 0;
        for (int i =0; i<arrs.length; i++) {
            sum = arrs[i]+sum;
        }
        double avg = (double)sum/arrs.length;
        System.out.println("среднее значение = " + avg);

    }
}
public class task3 {
    public static void main(String[] args) {
        Lab6Task3.maxMethod(23,13,-78,61,0,11,79);
        Lab6Task3.minMethod(23,13,-78,61,0,11,79);
        Lab6Task3.avgMethod(23,13,-78,61,0,11,79);

    }
}
