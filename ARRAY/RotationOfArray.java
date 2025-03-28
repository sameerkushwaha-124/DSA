package ARRAY;

public class RotationOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        // right rotate
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            nums[(i+k)%(arr.length)]=arr[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

        // left rotate
        int arr1[]={1,2,3,4,5};
        for(int i=0;i<arr1.length;i++)
        {
            nums[i]=arr1[(i+k)%(arr1.length)];
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
