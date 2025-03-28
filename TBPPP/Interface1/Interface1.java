package TBPPP.Interface1;
abstract class Animal{
    void sleep(){

    }
    void eat(){

    }

}
//Before Java 8, interfaces could only contain abstract methods (methods without implementation).
//However, with the introduction of default and static methods in Java 8, and private methods in Java 9,
//it became possible to have non-abstract methods within interfaces.


interface Human{
    default void sleep(){

    }
    static void eat(){

    }
//    In interfaces, default methods provide implementations that can be overridden by implementing classes,
//    while static methods are associated with the interface itself and cannot be overridden.
    int age = 19; // by default static final
    void walk();

}
class Ravi implements Human{
    public void walk(){
        System.out.println("Ravi Can Walk");
    }
    public void sleep(){
        System.out.println("Ravi sleep for 2 hour");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        System.out.println(Human.age);
        Ravi obj = new Ravi();
        obj.sleep();
    }
}
