package ARRAY;

// time complexity : o(n)
// space complexity : o(1)

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,12,14};
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Reversal Of An Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
