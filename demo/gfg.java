package demo;

public class gfg {
    public static int solve(String s, int K){
        int count = 0;
        int len = s.length()-1;
        for (int i  = len;i>0;i--){
            if (s.charAt(i) == '0'){
                count++;
            }else{
                break;
            }
        }
        int res = len-count;
        if (res == 0){
            return res; 
        }else {
            return res+1;
        }

    }
    public static void main(String[] args) {
        String s = "10000";
        int k = 1;
        int res = solve(s,k);
        System.out.println(res);


    }
}
