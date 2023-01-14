package lab7.task4;

public class MyClass1 {
    public char ch;

    public void setChar(char ch) {
        this.ch = ch;
    }
    MyClass1(char ch){
        this.setChar(ch);
    }

    MyClass1 (MyClass1 cpy){
        this.setChar(cpy.ch);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " ch = " + this.getChar();
        return ClassNameAndFieldValue;
    }
    public char getChar() {
        return ch;
    }
}
