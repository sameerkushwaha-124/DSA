package demo;

public class Demo {
    public static void main(String[] args) {
        String str = "Harshit is a good";
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            if(ch == 'a') a++;
            if(ch == 'e') e++;
            if(ch == 'i') i++;
            if(ch == 'o') o++;
            if(ch == 'u') u++;
        }
        System.out.println("a:"+a+", e:"+e+", i:"+i+", o:"+o+", u:"+u);
        int max = Integer.MIN_VALUE;
    }

}
