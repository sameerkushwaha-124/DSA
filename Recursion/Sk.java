package Recursion;

public class Sk {
    public static void main(String[] args) {
        int n = 144;
        int count  = 0;
        boolean bool = false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                bool = true;
                System.out.println("NotPrime");
                break;
            }
        }
        if(!bool){
            System.out.println("Prime");
        }
    }
}
