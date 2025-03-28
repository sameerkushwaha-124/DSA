package VeryBasic;

public class MyClass
{
    private int x;
    public MyClass() {
        x = 5;
    }
    public void setX(int value) {
        x = value;
    }
    public int getX() {
        return x;
    }
    public void incrementX() {
        x++;
    }
    public void printX() {
        System.out.println("The value of x is: " + x);
    }
}
class Main {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        obj1.setX(10);
        obj2.incrementX();
        obj1.printX();
        obj2.printX();
    }
}
