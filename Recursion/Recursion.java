package Recursion;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.Arrays;
public class Recursion {
    final static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<List<Integer>> ls = new ArrayList<>();
//        int num = 2;
//        int power = 10;
//        System.out.println(pow(num,power));

//        int arr[] = {0, 2, 4, 1, 3};
//        int new_arr[] = new int[arr.length];
//        arr = inverse(arr,new_arr,0);
//        System.out.println(Arrays.toString(new_arr));
//        System.out.println(Arrays.toString(arr));

//        String s = "ABA";
//        char ch[] = s.toCharArray();
//        Arrays.sort(ch);
//        s="";
//        for(int i = 0; i < ch.length; i++){
//            s =s + ch[i];
//        }
//        List<String> list = new ArrayList<>();
//        permutation0(list,"",s,s.length());
//        System.out.println(list);

//        int nums[] = {1,2,3};
//        int n = nums.length;
//        permutation1(ls,nums,n,new boolean[n],new ArrayList<>());
//        System.out.println(ls);

         // Approach 2.
//        permutation1(nums);

        // combination1.

//        combination1(ls,3,3,new ArrayList<>(),1);
//        System.out.println(ls);

//        combination1(ls,new int[]{1,2,3,4},new ArrayList<>(),3,0);
//        System.out.println(ls);
//        int n = 5;
//        int k = 73;
//        char ch[] = {'0','a','b','c','d','e','f','g','h','i','j','k','l',
//                'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        List<String> list = new ArrayList<>();
//        recurr(n,k,"",ch,list);
//        String str = list.get(0);
//        System.out.println(str);


        // printing n sum;
//        System.out.println("sum of these number is : "+nSum(1,10,0));

        // reverse an array : 1 2 3 4 5 6 >> 6 5 4 3 2 1
        revArray(new int[]{1,2,3,4,5,6},0);

        // check string is pelindrom or not.
        System.out.println(pelindrom("JAHAJ",0));


    }

    // calculating power at any base.
    public static long pow(int num,int power){
        // you can use mod.
        if(power == 0){
            return 1;
        }
        long result = pow(num,power / 2);
        result = (result * result) % mod;
        if(power % 2 == 1){
            result = (result * num) % mod;
        }
        return result;
    }

    // inverse of an array.
    static int[] inverse(int arr[], int new_arr[],int i){  // {3,0,1,3}
        if(i == arr.length){
            return new_arr;
        }
        int value = arr[i];
        new_arr[value] = i;
        return inverse(arr,new_arr,i+1);
    }
    static void printing(int new_arr[]){
        for(int n : new_arr){
            System.out.print(n + " ");
        }
    }

    // Unique permutaion in lexicographical order.
     static void permutation0(List<String> list,String ans,String s,int n){
        if(ans.length() == n){
            if(!list.contains(ans))
                list.add(new String(ans));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String first = s.substring(0,i);
            String last = s.substring(i+1);
            permutation0(list,ans+ch,first+last,n);
        }
    }

    // Appraoch 1.
    static void permutation1(List<List<Integer>> ls, int nums[],int n, boolean freq[],List<Integer> list){
        // total number of permutation = n! >> 3! = 6.
        if(list.size() == n){
            if(!ls.contains(list))
            ls.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < n; i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                permutation1(ls,nums,n,freq,list);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }

    }
    // Approach 2.
    static void permutation1(int nums[]){

    }

    // combination 1.
    public static void combination1(List<List<Integer>> ls, int n,int k,List<Integer> list,int start){
        if(list.size() == k){
            if(!ls.contains(list))
                ls.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <= n ; i++){
            list.add(i);
            combination1(ls,n,k,list,i+1);
            list.remove(list.size()-1);
        }
    }

    public static void combination1(List<List<Integer>> ls,int arr[],List<Integer> list,int k,int start){
        if(list.size() == k){
            if(!ls.contains(list))
                ls.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < arr.length ; i++){
            list.add(arr[i]);
            combination1(ls,arr,list,k,i+1);
            list.remove(list.size()-1);
        }
    }
    public static void recurr(int n, int k, String ans, char[] ch, List<String> list){
        if(k == 0 && n == ans.length()){
            list.add(new String(ans));
            return;
        }
        if(k < 0 || ans.length() > n){
            return;
        }
        for(int i = 1; i < 27; i++){
            if(list.size() == 0)
            recurr(n,k-i,ans+ch[i],ch,list);
        }
    }

    public static int nSum(int s,int n,int sum){
        if(s == n+1){
            return sum;

        }System.out.println(s);
        return nSum(s+1,n,sum+s);
    }
    public static void revArray(int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        revArray(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }

    public static boolean pelindrom(String str,int idx){
        if(idx == str.length()){
            return true;
        }
        if(str.charAt(idx) == str.charAt(str.length()-1-idx)){
            return pelindrom(str,idx+1);
        }
        return false;
    }


}
