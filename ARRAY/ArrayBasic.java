package ARRAY;

// {1,2,2,3,3,3,4} -->> can be short using single loop o(n).
// {1,2,1,3,4,3} -->> can be short using hashmap o(n)

public class ArrayBasic {
    public static int removeDuplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];

        return j;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,2,3,3,4,4,4,5,5,6,6,6,6};
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        j = removeDuplicates(arr, n);

        for (int i = 0; i < j; i++)
            System.out.print(arr[i] + " ");
    }
}