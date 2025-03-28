package ARRAY;

//tapping rain water>>>>

//Given n non-negative integers representing an elevation
//map where the width of each bar is 1, compute how much
// water it can trap after raining.

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented
// by array [0,1,0,2,1,0,1,3,2,1,2,1].
// In this case, 6 units of rain water (blue section) are being trapped.


public class TappingWater
{
    public static void tappingWater(int nums[])
    {
        int array1[]=new int[nums.length];
        int array2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            array1[i]=nums[i];
            array2[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if( array1[i]>array1[i+1])
            {
                array1[i+1]=array1[i];
                if (i==nums.length-2)
                {
                    break;
                }
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            System.out.print(array1[j]+ " ");
        }
        for(int i=nums.length-1;i>0;i--)
        {
            if(array2[i]>array2[i-1])
            {
                array2[i-1]=array2[i];
                if(i==1)
                {
                    break;
                }
            }
        }
        System.out.println();
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(array1[i]<array2[i])
            {
                System.out.print(array1[i]-nums[i]+" ");
                sum=sum+array1[i]-nums[i];
            }
            else if(array1[i]==array2[i])
            {
                System.out.print(array1[i]-array2[i]+" ");
            }
            else {
                System.out.print(array2[i]-nums[i]+" ");
                sum=sum+array2[i]-nums[i];
            }
        }
        System.out.println();
        System.out.println("total trapped water is :"+sum);
    }
    public static void main(String args[])
    {
//        int n;
//        int nums[];
//        System.out.println("Enter the size of an array:");
//        Scanner scan=new Scanner(System.in);
//        n=scan.nextInt();
//        nums=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            nums[i]=scan.nextInt();
//        }
        tappingWater(new int[]{1,8,6,2,5,4,8,3,7});
    }

}
