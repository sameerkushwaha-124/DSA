package BitManipulation;

public class Xor {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }
    public static int minBitFlips(int start, int goal) {
        int ans = 0;
        // XOR will give 1 where the bits are different
        int xor = start ^ goal;

        while(xor!=0){
            // If the last bit is 1, increment count
            ans += xor & 1;

            // Right-shift to check the next bit
            xor >>=1;
        }
        return ans;
    }
}
