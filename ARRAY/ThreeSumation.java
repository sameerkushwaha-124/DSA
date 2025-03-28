package ARRAY;

import java.util.*;
public class ThreeSumation{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        Arrays.sort(arr);
        int target = sc.nextInt();
        for(int i = 0; i < n; i++){
            int l = i+1;
            int r = n-1;
            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum == target) {
                    System.out.println(i + ", " + l + " and " + r);
                    l++;
                    r--;
                }
                else if(sum < target){
                    l++;
                }else{
                    r--;
                }
            }

        }
    }
}
