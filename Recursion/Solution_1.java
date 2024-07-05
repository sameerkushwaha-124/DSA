package Recursion;
// check whether the given array is sorted or not.

public class Solution_1 {
    public static void main(String args[]){
//        int arr[] = {2,3,4,5,5,6};
//        int index = 0;
//        boolean value = sort(arr,index);
//        System.out.println(value);
//
//        printing(5);


//        System.out.println(power(2,5));

//        System.out.println(fibonacci(5));
//        int value = sumNum(3,1000);
//        System.out.println(value);


        String str1 = "abcd";
        String ans = "";
        int index = 0;
        subSequence(str1,ans);

//        String str = "";
//        int n = 3;
//        Solution_1.coin(str,n);

//        String str2 = "abcdefg";
//        int k = 6;
//        String str1 = Solution_1.reverseStr(str2,k);
//        System.out.println(str1);

    }
    public static boolean sort(int arr[],int i){
        // base case
        if(i == arr.length-1){
            return true;
        }
        // task
        else if(arr[i] <= arr[i+1]){
            return sort(arr,i+1);
        }
        else{
            return false;
        }
    }

    public static void printing(int n){
        if(n==0){
            return;
        }
            printing(n-1);
            System.out.println(n);

    }

    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        return a*power(a,b-1);
    }

    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int sumNum(int a, int b){
        if(b==0){
            return a;
        }
            a++;
            return sumNum(a,b-1);
    }
    public static void subSequence(String str, String ans){
         if(str.length()==0 ){
             System.out.println(ans);
             return;
         }
             subSequence(str.substring(1),ans+str.charAt(0));
             subSequence(str.substring(1),ans);

    }
//static int count = 0;
    public static void coin(String str, int n){
        if(n == 0){

            System.out.println(str);
            return;
        }
            if(str.length()==0 || str.charAt(str.length()-1)!='H' &&  str.charAt(0)!='H'){
               coin(str+"H",n-1);
            }
            coin(str+"T",n-1);
    }
//    static int i = 0;
//    public static String reverseStr(String s, int k) {
//        if (k >= s.length()) {
//            StringBuilder str1 = new StringBuilder(s);
////            str1.reverse();
//            String str12 = new String(str1);
//            return str12;
//        } else {
//                StringBuilder str1 = new StringBuilder(s.substring(i,k+i));
//                str1.reverse();
////                System.out.println(str1);
//                StringBuilder str2 = new StringBuilder(s.substring(k));
////                System.out.println(str2);
//
//                String str = new String(str1 + "" + str2);
//            i =2*k + 2*i;
//                return reverseStr(str,i);
//        }
//    }
}
