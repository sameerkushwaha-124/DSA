package Recursion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays.*;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {
    public static void main(String[] args) {

//        String str = "";
//        int sp = 0;
//        int ep = 4;
//        int n = 6;
////
//        Solution_2.dice(4,"",3);
////
//        int value1 = Solution_2.dice_six(sp,ep,str,3);
//        System.out.println(value1);

//        String str1 = "";
//        int o = 0;
//        int c = 0;
//        int n1 = 3;




//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        Solution_2 obj = new Solution_2();
//        obj.merge(nums1, m, nums2,n);


//        int sum = 0;
//        int num = 38;
//        int total_sum = sumOfNumber(sum,num);
//        System.out.println(total_sum);

//        int num = 12345;
//        int total_sum = sumOfNumber(num);
//        System.out.println(total_sum);
//
//        int num = 4;
//        int value = alternateSumSeries(num);
//        System.out.println(value);

//        validParenthesis("",0,0,3);

//
//        System.out.println(path("",0,0,3-1,3-1));

//        System.out.println();
//        lexicoGra(0,10);
//
//                System.out.println(addDigits(38));

//        String str = "abc";
//        char ch[] = str.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(Arrays.toString(ch));
//        String str1 = "";
//        for(int i = 0; i < ch.length;i++ ){
//            str1 = str1 + ch[i];
//        }


//        String ans = "";
//        permutation("abc",ans,"abc");

//        int n


//        pairSum(100,new int[]{10,20,30,40,60,70,80,100});

//        int index = binarySearch(new int[]{1,2,3,4,4,5}, 3,0,new int[]{1,2,3,4,4,5}.length-1);
//        System.out.println(index);

        permutationNum(3, "", new ArrayList<>());
    }

    // number of ways : use recursion.


    private static int fact(int n){
        if(n < 2){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void dice(int target, String str,int face){
        if(target == 0){
            System.out.println(str);
            return ;
        }
        if(target < 0){
            return;
        }
        for(int i = 1; i <= face; i++){
            dice(target-i,str+i,face);
        }
    }

//    static int count = 0;
        public static int dice_six(int sp, int ep, String str, int n){
        if(sp == ep){
            System.out.println(str);
            return 1;
        }if(sp>ep){
            return 0;
            }
        int count=0; 
        for(int i = 1 ; i<=n ; i++){
            int z = dice_six(sp+i,ep,str+i,n);
             count = count + z;
        }
            return count;
        }
    int i = 0;
    int j = 0;
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(i == m+n){
            Arrays.sort(nums1);
            return;
        }
        if(nums1[i] == 0){
            nums1[i] = nums2[j];
            j++;
        }
        i++;
        merge(nums1,m,nums2,n);
        return;
    }

    public static int sumOfNumber(int sum, int num){
        if(num == 0){
            return 0 ;
        }
        sum = sum + num % 10 + sumOfNumber(sum,num/10);
        return sum;
    }


    // another way;
    public static int sumOfNumber(int num){
        if(num == 0)
            return 0;
        return num % 10 + sumOfNumber(num / 10);
    }

    public static int alternateSumSeries(int num){

        // code for negative even alternate sum : - 6 + 5 - 4 + 3 - 2 + 1;

        if(num == 0)
            return 0;
        if(num % 2 == 0)
            return  alternateSumSeries(num-1) - num;
        else{
            return   alternateSumSeries(num-1) + num ;
        }
    }

    public static void validParenthesis(String str , int o, int c,int n){
        if(o == n && c ==n ){
            System.out.println(str);
            return;
        }if(o <= n){
            validParenthesis(str+"(",o+1,c,n);
        }if(c < o){
            validParenthesis(str+")",o,c+1,n);
        }
    }

    static int path(String str, int  i, int j, int m, int n){
        if(i == m && j == n){
            System.out.println(str);
            return 1;
        }
        int a = 0;
        if(i < m ){
           a = path(str+"V",i+1,j,m,n);
        }

        int b = 0;
        if(j < n ) {
            b = path(str + "H", i, j + 1, m, n);
        }
        int c = 0;
        if(i < m && j < n){
            c =  path(str+"D",i+1,j+1,m,n);
        }
        return a+b+c;
    }

    static void lexicoGra(int start,int n1){
        if(start > n1){
            return;
        }
        int i = 0;
        System.out.print (start + " ");
        if(start == 0){
            i++;
        }
        for( ;i <= 9; i++){
            lexicoGra(start*10 + i,n1);
        }
    }
   static int sum = 0;
    static int addDigits(int n){
        if(((n+"").length() == 1)){
            return 0;
        }
        if((sum+"").length() > 1){
            sum = sum + addDigits(n/10);
        }
        return sum;
    }

    static void pairSum(int target, int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
static int count = 0;
    static void permutation(String str,String ans,String new_string){
        if(str.isEmpty()){
            int count1 = 2;
            if(ans.equals(new_string)){
                count++;
                count1 = 1;
            }
            if(count > 0 && count1 == 2){
                System.out.println(ans);
            }
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch =  str.charAt(i);
            String f = str.substring(0,i);
            String l = str.substring(i+1);
            permutation(f+l,ans+ch,new_string);
        }
    }
    static void  permutationNum(int n, String str, List<Integer> list) {
        if (str.length() == 3) {
            System.out.print(str + " ");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (list.contains(i)) {
                continue;
            }
            list.add(i);
            permutationNum(n, str + i, list);
            list.remove(list.size()-1);
        }
    }
    static int binarySearch(int arr[] ,int target, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start  + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target ){
            binarySearch(arr, target, start,mid - 1);
        }
        return binarySearch(arr, target,mid - 1, end);
    }

}

