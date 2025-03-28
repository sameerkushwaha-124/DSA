package ARRAY;
// this is more efficient : time  complexity > 0(n)
// space complexity > 0(1)
public class Palindrom {
    public static void main(String args[])
    {
        int arr[]={1,2,3,2,1};
        int flag=0;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-1-i])
            {
                flag=1;
                System.out.println("Not Parlinrom.");
                break;

            }
        }
        if(flag==0)
        {
            System.out.println("Palindromic Array.");
        }
    }
}
