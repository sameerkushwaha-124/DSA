package ARRAY;
// largest number in a array:
import java.util.Scanner;
public class BasicOperation {

//    public static void largestNumber(int nums[]) {
//        int i = 0;
//        int larg = Integer.MIN_VALUE;
//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] >= larg) {
//                larg = nums[i];
//            }
//        }
//        System.out.print(larg);
//    }

    static void largestNumber(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Max element in an array:" + max);
    }




 //  Total possible pairs.....

//    public static  void totalPair (int nums[])
//    {
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i; j<nums.length;j++)
//            {
//                System.out.print("("+nums[i]+","+nums[j]+")");
//            }
//            System.out.println();
//        }
//    }

    static void totalPairs(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }



//    Sum of elements of array......


    public static void sumOfElement(int nums[]){
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.print("sum of element of array: "+sum);
    }

//    Finding sub array of a array and value of maximum sub arrray......
//    public static void subArray(int nums[])
//    {
//        int sum_max=Integer.MIN_VALUE;
//        for(int i =0;i<nums.length;i++)
//        {
//            for(int j=i;j<nums.length;j++)
//            {
//                int sum=0;
//                for(int k=i;k<=j;k++)
//                {
//                    System.out.print(nums[k]+" ");
//                    sum=sum+nums[k];
//                }
//                if(sum_max<=sum)
//                {
//                    sum_max=sum;
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println(("Maximum value of sub array is : "+sum_max));
//    }

    static void subArray(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                }
                if(max<sum){
                    max=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum sum of a sub array:"+ max);
    }


    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Entere the size:");
        int n = scan.nextInt();
        if(n>=5)
        {
            n=5;
        }
        int nums[]= new int[n];
        for( int i =0;i < n; i++)
        {
            nums[i]=scan.nextInt();
        }
//        largestNumber(nums);
//        totalPairs(nums);
//        sumOfElement(nums);
//        subArray(nums);


    }
}
