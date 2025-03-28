package ARRAY;
class Solution1 {
    public int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int array[] = new int [nums1.length+nums2.length];
        int i=0;
        for(i=0;i<nums1.length;i++){
            array[i] = nums1[i];
        }
//        System.out.println(i);
        int j = 0;
        while(j<nums2.length){
            array[i] = nums2[j];
            j++;
            i++;
        }
        for(int k=0;k<array.length;k++){
            for(int l = k+1;l<array.length;l++){
                if(array[k]>array[l]){
                    int temp = array[k];
                    array[k] =array[l];
                    array[l] = temp;

                }
            }
        }
        double b = 0;
        int l = array.length;
        if((array.length)%2!=0){
           b = array[array.length/2];
        }
        else{
           b = (array[l/2-1]+array[l/2])/2.0;
        }
        System.out.println(b);
        return array;


    }
}


public class JoiningOfTwoArray {
    public static void main(String args[]){
        int nums1[] = {1,2,5};
        int nums2[] = {3,4,6};
        Solution1 solve = new Solution1();
        int array[] = new int[nums1.length+nums2.length] ;
        array=solve.findMedianSortedArrays(nums1, nums2);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }

}
