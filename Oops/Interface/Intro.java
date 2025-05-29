package Oops.Interface;
interface A{
    int num = 6;
    void show();
}
class B implements A{
    public void show(){
        System.out.println("In Show");
    }
}
public class Intro {
    public static void main(String[] args) {
     //   A obj1 = new A(); // not possible to instantiate.

        B obj = new B();
        obj.show();

        A obj2 = new B();
        obj2.show();

    }
}
