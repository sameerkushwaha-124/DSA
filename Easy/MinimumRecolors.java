package Easy;

public class MinimumRecolors {
    public static void main(String[] args) {
        String str = "WBWBBBW";
        int k = 2;
        int min_ope = Integer.MAX_VALUE;
        for(int i = 0; i < str.length() -k; i++){
            int w = 0;
            for(int j = i ; j < i+k; j++){
                if(str.charAt(j) == 'W'){
                    w++;
                }
            }
            min_ope = Math.min(min_ope,w);
        }
        System.out.println(min_ope);
    }

}
