package lab13;

/*
4. Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread #" + threadNumber + " - " + Thread.currentThread().getName());
            });
            thread.start();
        }
    }
}
