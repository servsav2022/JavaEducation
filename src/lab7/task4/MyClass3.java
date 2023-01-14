package lab7.task4;

public class MyClass3 extends MyClass2 {
    MyClass3(char ch) {
        super(ch);
    }
    public int a;
    public void setValues(char ch, String str, int a) {
        super.ch = ch;
        super.str = str;
        this.a = a;
    }

    MyClass3(char ch, String str, int a) {
        super(ch,str);
        setValues(super.ch, super.str, a);
    }

    MyClass3(MyClass3 copy) {
        super(copy.ch, copy.str);
        this.setValues(copy.ch, copy.str, copy.a);
    }
    @Override
    public String toString() {
        String ThirdFieldValue =
                "\n str2 = " + this.getInt();
        return super.toString()+ThirdFieldValue;
    }
    public int getInt() {
        return a;
    }

}
