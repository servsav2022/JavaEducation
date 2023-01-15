package lab7.task5;

public class MyClass3 extends MyClass1{
    protected char chr;

    public void setChar(char chr) {
        this.chr = chr;
    }

    MyClass3(String str, char chr) {
        super(str);
        this.setChar(chr);
    }
    @Override
    public void ShowString() {
        String SecondFieldValue =
                " myclass3 = \"" + this.getChar()+"\"";
        super.ShowString();
        System.out.println(SecondFieldValue);
    }
    public char getChar() {
        return chr;
    }
}
