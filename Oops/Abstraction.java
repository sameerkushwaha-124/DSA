package Oops;

import VeryBasic.New;

abstract class Abs1{
    abstract public void m1(int a);
    public abstract void m1(String str);
}
class NewAbs extends Abs1{
    public void m1(int b){
        System.out.println(b);
    }
    public void  m1(String str1){
        System.out.println(str1);
    }
}
class Abstraction {
   public static void main(String agrs[]){
        String arg="Sameer Kushwaha";
        int a = 20;
        NewAbs obj1 = new NewAbs();
    //    Abs1 obj = new Abs1();  can't be create a object because it has no body.
        Abs1 obj;

        obj = obj1;

        obj.m1(arg);
        obj1.m1(arg);



    }
}