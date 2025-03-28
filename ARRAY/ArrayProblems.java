package ARRAY;

class ArrayProblems{

    static void max( long arr[]){
        long  max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }


    static void countEvenOdd(long arr[]){
        long count_even = 0;
        long count_odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count_even += 1;
            } else {
                count_odd += 1;
            }
        }
        System.out.println("Even Number: " + count_even +"\n"+
                "Odd Number: " + count_odd );
    }

    static void  joiningOfTwoArrays(){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5};
        int n = arr1.length+arr2.length;
        int array[] = new int [n];
        int i = 0;
        while(i<arr1.length){
            array[i] = arr1[i];
            i++;
        }
        int j=0;
        while(j<arr2.length){
            array[i] = arr2[j];
            i++;
            j++;
        }
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        }
    }


    public static void main(String agrs[]){
        long arr[] = {2,53,52,1,34,0};
//        ArrayProblems.max(arr);
//        ArrayProblems.countEvenOdd(arr);

        ArrayProblems.joiningOfTwoArrays();
    }
}
