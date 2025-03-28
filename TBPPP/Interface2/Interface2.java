package TBPPP.Interface2;

@FunctionalInterface // allows only  1 abstract method
interface A{
    default void sleep(){
        System.out.println("sleep in A");
    }
    static void eat(){
        System.out.println("eat in A");
    }
    void run();
    String toString();
}
interface B{
    void fighter();
}
class C implements A,B{
    public void sleep(){
        System.out.println("this is sleep in C");
    }
    public void run(){
        System.out.println("running");
    }
    public void fighter(){
        System.out.println("fighter");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        A obj = new A(){
            public void run(){
                System.out.println("This is method of interface A");
            }
        };
        obj.sleep();
        obj.run();


        // or..


        A obj1 = () -> System.out.println("1234");

        obj1.run();




    }
}
