package Interface;


interface Car{       // interface is a concept (car is a concept)
    void drive();


}
interface Bus{
    void drive();
}
class Wagnor implements Car, Bus{
    public void drive(){
        System.out.println("Driving..");
    }

}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Car obj = new Wagnor();
        obj.drive();
    }
}
