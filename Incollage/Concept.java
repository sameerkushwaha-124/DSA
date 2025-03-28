package Incollage;

public class Concept {
    public static void main(String[] args) {
        //gcd.
//        int gcd = gcdCal(12,18);
//        System.out.println(gcd);
        //lcm.
//        System.out.println(12*18 / gcd);

        // toLowerCase:

//        String str1 = "A man, a plan, a canal: Panama";
//        str1.toLowerCase();
//        str1=str1.replaceAll("[^a-z A-Z 0-9]","");
//        String str2[] = str1.split(" ");
//        System.out.println(Arrays.toString(str2));

        String str1= "hello";
        String str2= "hello";
        System.out.println(str1.equals(str2));

        double d1 = 84.6;

        double d2 = 0.45;

        int i1 = 27;

        int i2 = -45;

        System.out.println("Ceiling of '" + d1 + "' = " + Math.ceil(d1));

        System.out.println("Floor of '" + d1 + "' = " + Math.floor(d1));

        System.out.println("Ceiling of '" + d2 + "' = " + Math.ceil(d2));

        System.out.println("Floor of '" + d2 + "' = " + Math.floor(d2));

        System.out.println("Round off for d1: " + Math.round(d1));

        System.out.println("Round off for d2: " + Math.round(d2));

        System.out.println("Absolute value of i1: " + Math.abs(i1));

        System.out.println("Absolute value of i2: " + Math.abs(i2));

        System.out.println("Absolute value of d1: " + Math.abs(d1));

        System.out.println("Absolute value of d2: " + Math.abs(d2));


    }
    static int gcdCal(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcdCal(b,a % b);
        }

    }
}
