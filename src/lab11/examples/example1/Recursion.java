package lab11.examples.example1;

public class Recursion {
    public static void  m(int x) {
        System.out.println("x=" +x);
        if ((2*x+1)<20) {
            m(2*x + 1);
        }
    }
    public static void main(String[] args) {
        m(1);
    }
}
