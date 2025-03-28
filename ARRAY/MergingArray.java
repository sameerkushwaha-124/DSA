package ARRAY;

public class MergingArray {
    public static double Meadian(int[] arr1,int arr2[]) {
        int[] Arr=new int[arr1.length+arr2.length];
        int n=Arr.length;
        int i=0;
        while(i<arr1.length)
        {
            Arr[i]=arr1[i];
            i++;
        }
        int j=0;
        while(j<arr2.length){
            Arr[i]=arr2[j];
            i++;
            j++;
        }
        if(Arr.length%2!=0){
            return (double)Arr[Arr.length/2];
        }
        else{
            return (Arr[n/2-1]+Arr[n/2])/(double)2;
        }
    }

    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4,5};
        double m=Meadian(arr1,arr2);
        System.out.println("Meadian:"+m);
    }
}
