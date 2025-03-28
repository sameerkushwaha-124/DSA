package ARRAY;
// time complexity : o(n)
// space complexity : o(1)
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        int n=arr.length;
        int sum=0;
        int sum_of_natural_num=(n)*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Missing Number:"+(sum_of_natural_num-sum));
    }
}
