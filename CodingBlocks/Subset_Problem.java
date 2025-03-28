package CodingBlocks;

import java.util.*;

public class Subset_Problem {
    static int cont = 0;
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums[i] = sc.nextInt();
        }
        int goal = sc.nextInt();

        solve(nums, goal, list, 0);
        System.out.println("\n"+ cont);
    }
 static void solve(int[] arr, int target, List<Integer> ls, int idx) {

        if (target == 0) {
            for (int num : ls) {
                System.out.print(num + " ");
            }
            System.out.print("  ");
            cont++;
            return;
        }
        if(idx >=  arr.length)
        {
            return ;
        }
        ls.add(arr[idx]);
        solve(arr, target - arr[idx], ls, idx + 1);
        ls.remove(ls.size() - 1);
        solve(arr, target, ls, idx + 1);
    }
}
