package Incollage;

import java.util.*;
import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        permNum2(3,new ArrayList<>(),list);
//        permStr(3,"",list,new boolean[]{false,false,false});
//        System.out.println(list);


//        mergeTwoSortedArray(new int[]{1,5,6,19},new int[]{1,2,3,4,5,6});
//
//        merging(new int[]{1,5,6},new int[]{7,8,9,10,89});

//        leftSmallRightGreaterThroughLastIdx(new int[]{7,6,9,4,11,2,5});

//        partitionThroughLastIndex(new int[]{7, 6, 9, 4, 11, 2, 5});

//        partitionThroughAnyPoint(new int[]{7, 6, 9, 4, 11, 2, 5},0,new int[]{7, 6, 9, 4, 11, 2, 5}.length-1);




    }

    static void permNum(int arr[], List<Integer> list, List<List<Integer>> result, boolean bool[]) {
        if (list.size() == arr.length) {
            if (!result.contains(list))
                result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (bool[i])
                continue;
            bool[i] = true;
            list.add(arr[i]);
            permNum(arr, list, result, bool);
            list.remove(list.size() - 1);
            bool[i] = false;
        }
    }

    static void permNum2(int n, List<Integer> list, List<String> result) {
        if (list.size() == n) {
            result.add(toString(list));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (list.contains(i))
                continue;
            list.add(i);
            permNum2(n, list, result);
            list.remove(list.size() - 1);
        }
    }

    static String toString(List<Integer> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i);
        }
        return str;
    }

    static void permStr(int n, String str,List<String> list,boolean bool[]){
        if(str.length() == n){
            list.add(str);
            return;
        }
        for(int i = 1; i <= n; i++) {
            if (bool[i - 1]) {
                continue;
            }
            bool[i - 1] = true;
            permStr(n, str + i, list, bool);
            bool[i - 1] = false;
        }
    }


    public static void mergeTwoSortedArray(int arr1[], int arr2[]) {
        // nlog n , n
        int arr3[] = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void merging(int arr1[],int arr2[]){
        // n
        int arr3[] = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[i++];
            }
        }
        while (i < arr1.length) {
            arr3[idx++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[idx++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));

    }


    public static void leftSmallRightGreaterThroughLastIdx(int arr[]) {
        int value = arr[arr.length - 1];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] <= value) {
                list1.add(arr[i]);
            }
            if(arr[i] >= value) {
                list2.add(arr[i]);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }

    public static void partitionThroughLastIndex(int arr[]) {
        int value = arr[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < value) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[idx];
        arr[idx] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void partitionThroughAnyPoint(int arr[],int si,int ei){
        int t = arr[arr.length-1];
        arr[arr.length-1] = arr[3];
        arr[3] = t;
        int value = arr[arr.length-1];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < value){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[idx];
        arr[idx] = temp;
        System.out.println(Arrays.toString(arr));
    }




}
