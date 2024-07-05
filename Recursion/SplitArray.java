package Recursion;
import java.util.*;
public class SplitArray {
    public static void main(String[] args) {
        fun(new int[]{1,2,3,4,5,6},0,0,0,new ArrayList<>(),new ArrayList<>());
        System.out.print(count);
    }
    static int count = 0;
    public static void fun(int arr[], int idx, int sum1,int sum2, List<Integer> list1, List<Integer> list2){
        if(idx == arr.length){
            if(sum1 == sum2){
                count++;
                print(list1,list2);
            }
            return;
        }
        list1.add(arr[idx]);
        fun(arr,idx+1,sum1+arr[idx],sum2,list1,list2);
        list1.remove(list1.size()-1);

        list2.add(arr[idx]);
        fun(arr,idx+1, sum1,sum2+arr[idx],list1,list2);
        list2.remove(list2.size()-1);
    }
    public static void print(List<Integer> list1, List<Integer> list2){
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.print(" and ");
        for(int i = 0; i < list2.size(); i++){
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
    }
}
