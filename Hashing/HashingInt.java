package Hashing;

import java.util.*;
public class HashingInt {
    int nums[] = new int[1000000000];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[1000000];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // preComputation.
        int hash[] = new int[1000];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        int q = 100000000;
        for(int i = 0; i < q; i++){
            System.out.println("Enter Your Frequent Number OR Hit Non Integer AND Non functional Key To Exit :");
            try{
                int num  = sc.nextInt();

                System.out.println(hash[num]);

            }catch(Exception error){
                System.out.println("Exit Program");
                return;
            }

        }
    }
}
