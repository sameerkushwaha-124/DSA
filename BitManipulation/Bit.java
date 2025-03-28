package BitManipulation;

public class Bit {
    public static void main(String[] args) {
        System.out.println(getBit(10,1));  // 1 0 1 0 : first bit = 1 (True)
    }
    public static boolean getBit ( int num, int i ){
        int result = num & (1<<i) ;
        if ( result == 0){
            return false ;
        }else {
            return true ;
        }
    }
}
