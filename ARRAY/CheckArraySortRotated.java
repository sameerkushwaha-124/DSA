package ARRAY;

public class CheckArraySortRotated {
    boolean checkArraySortRotated(int arr[])
    {
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0])
        {
            count++;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        CheckArraySortRotated obj=new CheckArraySortRotated();
        boolean bool=obj.checkArraySortRotated(arr);
        System.out.println(bool);


    }
}
