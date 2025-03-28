package Oops;

interface Computer{
    void compileCode();

}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println("you got 5 errors");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("you got 5 errors, faster");
    }
}

class Developer{
   // void buildApp(laptop obj){
        void buildApp(Computer obj){
        System.out.println("Building App");
        // for building app we need laptop.
  //  Laptop obj = new Laptop();for single developer, if you say developer to build another app then
        // every time the object of Laptop created.
        // but we don't want so that we will create out of the buildApp method
        // and within the class.

        // help : company ek developer ko ek hi laptop deti hain for building app
        // not for each project;
        // one min there is problem leptop toh company tabhi la leti hain jab use kisi employee to
        // hire karna hota hain so that we should not create object of leptop in this Developer
        // class we should before creating the object of Developer.

       obj.compileCode();
    }
}

public class NeedOfInterface { // this is main company
    public static void main(String args[]){
       // Laptop obj = new Laptop();
        // agar company laptop ke place pe Desktop de.
        Computer  obj = new Desktop();

        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
