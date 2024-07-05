package Recursion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Solution_3 {
    public static void main(String str[])
    {
//        int num = 886996;
//        System.out.println(num);
//        int value = reverse(num,0);
//        System.out.println(value);


//        int num1 = alternateDigitSumNew(value);
//        System.out.println(num1);
//        subArray(new int []{1,-2,4,-5,3});

//        System.out.println(lengthOfLongestSubstring("abcabcbb"));


////        System.out.println('a' == 'a');
//        String[] d={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
//        String s="12";
//        String ans="";
//       keypad(s,ans,d);






        seatting(2,new boolean[]{false,false,false,false},"");
        seatting1(2,new boolean[]{false,false,false,false},0,"",0);

//                permutationCoin("",8,0,new int[]{2,3,5});
//
//        combinationCoinChange("",8,0,new int[]{2,3,5},0);


//        List<Integer> ans = new ArrayList();
//        coin_change(new int[]{2,3,5},8,ans,0);
//        List<List<Integer>> l1 = new ArrayList<>();
//        coin_chan(new int[]{2,3,5},8,new ArrayList<Integer>(),0,l1);
//        System.out.println(l1);

//        List<String> list = new ArrayList<>();
//        int coins[] = {2,3,5};
//        int amount = 8;
//        coin(coins,amount,"",list,0);
//        System.out.println(list);

    }



    static boolean value = true;
    public static int reverse(int n,int sum){
        if(n == 0){
            return n;
        }

        sum = sum * 10 + n % 10 + reverse(n/10,sum);
        return sum;

    }
    public static int alternateDigitSumNew(int n) {
        if(n == 0){
            return 0;
        }
        if(value){
            value = false;
            return alternateDigitSumNew(n/10) + n%10;
        }
        else{
            value = true;
            return alternateDigitSumNew(n/10) - n%10;
        }


    }
    static void subArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int count  = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) != s.charAt(j)){
                    count++;
                }else{
                    max = Math.max(max,count);
                    count = 0;
                    break;
                }
            }
        }
        return max;
    }

    public static void keypad(String s,String ans,String[] d) {
        if (s.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        String p = d[ch - '0'];
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
             keypad(s.substring(1), ans + p.charAt(i), d);
        }
    }
    static void seatting(int n,boolean seat[],String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < seat.length; i++){
            if(seat[i] == false){
                seat[i] =  true;
                seatting(n-1,seat,ans+"s"+(i+1)+"p"+i);
                seat[i] = false;
            }
        }
    }
    static void seatting1(int n,boolean seat[], int curr,String ans,int idx){
        if(curr == n){
            System.out.println(ans);
            return;
        }
        for(int i = idx; i < seat.length; i++){
            if(seat[i] == false){
                seat[i] =  true;
                seatting1(n,seat,curr+1,ans+"s"+(i+1),i+1);
                seat[i] = false;
            }
        }
    }

    static void permutationCoin(String ans,int target,int num,int arr[]){
        if(target == num){
            System.out.println(ans+" ");
            return;
        }
        if(num>target){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            permutationCoin(ans+arr[i],target,num+arr[i],arr);
        }
    }
    static void combinationCoinChange(String ans,int target,int num,int arr[],int idx){
        if(target == num){
            System.out.println(ans+" ");
            return;
        }
        if(num>target){
            return;
        }
        for(int i = idx; i < arr.length; i++){
            combinationCoinChange(ans+arr[i],target,num+arr[i],arr,i);
        }
    }

    static void coin_change(int coin[],int amount, List<Integer> ans,int idx){
        if(amount == 0){
            System.out.println(ans);
           return;
        }
        if(amount <= 0){
            return;
        }
        for(int i = idx; i < coin.length; i++){
            ans.add(coin[i]);
            coin_change(coin,amount-coin[i],ans,i);
            ans.remove(ans.size()-1);
        }
    }


    static void coin_chan(int coin[],int amount,List<Integer>l,int idx,List<List<Integer>>l1){
        if(amount == 0) {
            l1.add(new ArrayList<>(l));
            return;
        }
        if(amount < 0){
            return;
        }
        for(int i= idx; i < coin.length; i++){
            l.add(coin[i]);
            coin_chan(coin,amount-coin[i],l,i,l1);
            l.remove(l.size()-1);
        }
    }
        static void coin(int coin[], int amount,String str,List<String> list,int idx){
        if(amount == 0){
            list.add(str);
            return;
        }
        if(amount < 0)
            return;
        for(int i = idx; i < coin.length; i++){
            coin(coin,amount-coin[i],str+coin[i],list,i+1);
        }
    }
}
