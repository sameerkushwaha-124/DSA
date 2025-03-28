package Oops;
class Demo{
    String new_name;
    Demo(String new_name){
        this();
      //   this.name=name; there is no  instance name variable so that it will show error.
      this.new_name =new_name;
        System.out.println("String perametrise : "+ new_name);
    }
    Demo(){

        System.out.println("non Peramiterise");
    }
}


public class ThisAndSuper {
    public static void main(String[] args) {
        String name = "sameer";
        Demo d = new Demo(name);
//        Demo d1= new Demo();

    }
}
