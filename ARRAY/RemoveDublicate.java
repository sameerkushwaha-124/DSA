package ARRAY;

public class RemoveDublicate {
    void main(int []arr)
    {
        int arr1[];
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-5;
                }
            }
        }
        System.out.println("After Operation:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-5){
            System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,5,7,5};
        System.out.println("Before Operation:");
        for(int i=0;i<arr.length;i++)
        {
            if(i<=arr.length-2){
            System.out.print(arr[i]+",");}
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        RemoveDublicate obj=new RemoveDublicate();
        obj.main(arr);
    }
}
