package Wipro;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        int p = 0;
        int q = 2;
        int r = 8;
        for(int i = 2; i < 5; i++){
            p = 10&p;
            if((r&q&p) < (q-p-r)){
                q=(p&r)+q;

            }else{
                r = (q^q)&q;
            }
        }
        System.out.println(p+q);

    }
}
