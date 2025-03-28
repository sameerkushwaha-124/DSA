package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion1 {

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(fibonacci(5));
        List<String> list = new ArrayList<>();
        subSequence("baa","",list);
        for(String str : list)
            System.out.print(str + " ");
//
//        List<String> list = new ArrayList<>();
//        coinToss(3,list,"");
//        System.out.println(list);
//
//        dice(3,4,"");
//
//        System.out.println(sumOfDigits(1234,0));
//
//        System.out.println(alternateSum(10,0));
//
//        List<String> list1 = new ArrayList<>();
//        generateParenthesis(3,list1,"",0,0);
//        System.out.println(list1);
//
//        List<String> list2 = new ArrayList<>();
//        totalPathToReachLastIndex(list2,3,3,0,0,"");
//        System.out.println(list2);
//
//        permutationOfString("abc","");

//        permutationOfNumber(new int[]{1,2,3
//        },new ArrayList<>());

//        permutaionOfNumber1(3,"",new boolean[]{false,false,false});

//        permutationNumber2(3,"",new ArrayList<>());

//        System.out.println(rever(1234,0));


//        permutaionStr1("abc",new ArrayList<>());
//        permutationOfString("abc","");


//        List<List<String>> result = new ArrayList<>();
//        permutationStr(new String[]{"A","B","C"},new ArrayList<>(),result);
//    System.out.println(result);


//        combinatioinOfNumber1(new int[]{1,2,3},new ArrayList<>(),0);



    }

    public static int factorial(int n){
        if(n <= 2){
            return n;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void subSequence(String str, String ans,List<String> list){
        if(str.length() == 0){
            if(isPalindrom(ans)){
                if(!list.contains(ans))
                list.add(new String(ans));
            }
            return;
        }
        char ch = str.charAt(0);
        subSequence(str.substring(1),ans+ch,list);
        subSequence(str.substring(1),ans,list);
//      subSequence(str.substring(1), ans+(int)ch );
    }
    static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            if(i == j){
                return true;
            }
            else if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void coinToss(int n, List<String> list,String str){
        if(n == 0){
            list.add(str);
            return;
        }
        coinToss(n-1,list,str+"H");
        coinToss(n-1,list,str+"T");
    }

    public static void dice(int face,int target,String str){
        if(target == 0){
            System.out.println(str+" ");
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = 1; i <= face; i++){
            dice(face,target-i
                    ,str+i);
        }
    }

    public static int sumOfDigits(int n,int sum){
        if(n == 0){
            return sum;
        }
        return sumOfDigits(n/10,sum+n%10);
    }

    public static int alternateSum(int n,int sum){
        if(n <= 1){
            return n;
        }
        // -10 + 9 - 8 + 7 ..........+ 1 + 0;
        if(n % 2 == 0)
            return alternateSum(n-1,sum) - n;
        else
           return alternateSum(n-1,sum) + n;
    }

    public static void generateParenthesis(int n,List<String> list1, String str,int o,int c){
        if(str.length() == 2*n){
            list1.add(str);
            return;
        }
        if(o < n){
            generateParenthesis(n,list1,str+"(",o+1,c);
        }
        if(c < o) {
            generateParenthesis(n, list1, str + ")", o, c + 1);
        }
    }

    public static void totalPathToReachLastIndex(List<String> list2,int m, int n, int i, int j,
                                                 String str){
        if(i == m-1 && j == n-1){
            list2.add(str);
            return;
        }
        if(i < m){
            totalPathToReachLastIndex(list2,m,n,i+1,j,str + "V" );
        }
        if(j < n){
            totalPathToReachLastIndex(list2,m,n,i,j+1,str + "H");
        }
        if(i < m && j < n){
            totalPathToReachLastIndex(list2,m,n,i+1,j+1,str + "D");
        }
    }
    public static int rever(int n,int reverse){
        if(n == 0){
            return reverse;
        }
        reverse = reverse * 10 + n % 10;
        return rever(n / 10, reverse);
    }



   // backtracking.


    public static void permutationOfNumber(int arr[],List<Integer> list){
        if(list.size() == 3 ){
            System.out.println(list);
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
            permutationOfNumber(arr,list);
            list.remove(list.size()-1);
        }
    }

    public static void permutaionOfNumber1(int n,String ans,boolean[] bool){
        if(ans.length() == n){
            System.out.print(ans + " ");
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!bool[i-1]){
                bool[i-1] = true;
                permutaionOfNumber1(n,ans+i,bool);
                bool[i-1] = false;
            }
        }
    }

    public static void permutationNumber2(int n, String ans,List<Integer> list){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= n; i++){
            if(list.contains(i)){
                continue;
            }
            list.add(i);
            permutationNumber2(n,ans + i,list);
            list.remove(list.size()-1);
        }
    }
    private static void permutationStr(String str[] , List<String> list,
                                    List<List<String>> list1){
        if(list.size() == str.length){
            list1.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < str.length; i++){
            if(list.contains(str[i])){
                continue;
            }
            list.add(str[i]);
            permutationStr(str,list,list1);
            list.remove(list.size()-1);
        }
    }
    private static void permutaionStr1(String str, List<Character> list){
        if(list.size() == str.length()){
            System.out.println(list);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            if(list.contains(str.charAt(i))){
                continue;
            }
            list.add(str.charAt(i));
            permutaionStr1(str,list);
            list.remove(list.size()-1);
        }
    }
    public static void  permutationOfString(String str,String ans){
        if(ans.length() == 3){
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch =  str.charAt(i);
            String f = str.substring(0,i);
            String l = str.substring(i+1);
            permutationOfString(f+l,ans+ch);
        }
    }
    // combination
    public static void combinatioinOfNumber1(int arr[],List<Integer> list,int start){
        if(list.size() == 3){
            System.out.println(list);
            return;
        }
        for(int i = start; i < arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
            combinatioinOfNumber1(arr,list,i+1);
            list.remove(list.size()-1);
        }
    }













}
