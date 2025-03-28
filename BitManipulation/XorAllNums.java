package BitManipulation;

public class XorAllNums {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        for(int i = 0 ; i < nums1.length; i++){
            xor1 ^= nums1[i];
        }
        int xor2 = 0;
        for(int i = 0 ; i < nums2.length; i++){
            xor2 ^= nums2[i];
        }
        if(nums1.length % 2 == 0 && nums2.length % 2 != 0){
            return xor1;
        }else if(nums1.length % 2 != 0 && nums2.length % 2 == 0){
            return xor2;
        }
        else if(nums1.length % 2 == 0 && nums2.length % 2 == 0){
            return 0;
        }else{
            return xor2^xor1;
        }
    }
}
