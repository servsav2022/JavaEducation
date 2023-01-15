package lab7.task5;

public class MyClass2 extends MyClass1{
    protected int n;
    public void setInt(int n) {
        this.n = n;
    }

    MyClass2(String str, int n) {
        super(str);
        this.setInt(n);
    }
    @Override
    public void ShowString() {
        String SecondFieldValue =
                " n = \"" + this.getInt()+"\"";
        super.ShowString();
        System.out.println(SecondFieldValue);
    }
    public int getInt() {
        return n;
    }
}
