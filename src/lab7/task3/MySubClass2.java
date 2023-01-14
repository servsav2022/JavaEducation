package lab7.task3;

public class MySubClass2 extends MySuperClass1 {
    MySubClass2(int n) {
        super(n);
    }

    public char chr1;

    public void setIntStr(int n, char chr1) {
        super.n = n;
        this.chr1 = chr1;
    }

    MySubClass2(int n, char chr1) {
        super(n);
        this.setIntStr(n, chr1);
    }
    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getChar();
        return super.toString()+SecondFieldValue;
    }
    public char getChar() {
        return chr1;
    }
}
