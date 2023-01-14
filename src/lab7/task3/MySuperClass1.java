package lab7.task3;

public class MySuperClass1 {
    public int n;
    public void setInt(int n) {
        this.n= n;
    }

    MySuperClass1(int n){
        this.setInt(n);
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " n = " + this.getInt();
        return ClassNameAndFieldValue;
    }
    public int getInt() {
        return n;
    }
}
