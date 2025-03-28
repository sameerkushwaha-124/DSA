package ARRAY;

import java.util.Scanner;

public class JavaClass {

    static void squareElement(int arr[])
    {
        System.out.println("Square of element will be:");
        for(int i=0;i<arr.length;i++)
        {   if(arr[i]%2==0) {
            arr[i] = arr[i] * arr[i];
        }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void ABC(String str1)
    {
        System.out.println(str1);
        for (int i=0;i<str1.length();i++)
        {
            System.out.println(str1.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        squareElement(arr);

//        String str1="ABC";
//        ABC(str1);

    }
}
