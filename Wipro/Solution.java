package Wipro;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculateCompoundedAmount(p, r, n));
    }
    public static int calculateCompoundedAmount(double p, double r, int n) {
        double amt = p * Math.pow(1 + r / 100, n);
        return (int) Math.round(amt);
    }

}
