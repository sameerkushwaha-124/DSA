package CodingBlocks;

import java.util.*;
public class Main {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = str;
        System.out.println(counting(str,0,0));
        remohi(str,0);
        remoHi(str1,0);

        String str2 = sc.next();
        int value = subSequence(str2,"");
        System.out.println("\n" + value);
//      Sorting of string is not enough.
        List<String> str3 = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str4 = sc.next();
            lexicogra(str4,"",str3);
            Collections.sort(str3);
            for(int j = 0; j < str3.size() ; j++){
                System.out.println(str3.get(j));
            }
            str3.clear();
        }
    }
    private static int counting(String str,int start,int count){
        if(start == str.length()){
            return count;
        }
        if(str.charAt(start) == 'h' && str.charAt(start+1) == 'i'){
            count++;
        }
        return counting(str,start+1,count);
    }

    private static void remohi(String str,int start){
        System.out.println(str.replace("hi",""));
    }
    private static void remoHi(String str,int start){
        System.out.println(str.replaceAll("hi","bye"));
    }

    public static int  subSequence(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }
        char ch = str.charAt(0);
        int x =  subSequence(str.substring(1),ans);
        int y = subSequence(str.substring(1),ans+ch);
        int z = subSequence(str.substring(1), ans+(int)ch );
        return x + y + z;
    }
    static void lexicogra(String str,String ans,List<String> str1){
        if(str.length() == 0){
            // str1[idx] = ans;
            str1.add(ans);
            return;
        }
        lexicogra(str.substring(1),ans+str.charAt(0),str1);
        lexicogra(str.substring(1),ans,str1);
    }
}

