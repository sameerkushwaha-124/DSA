package CodingBlocks;

import java.util.Scanner;

public class RemoveReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(remRepla(str1,0));
    }
    static int remRepl(StringBuilder str1,int i,int count){
        if(i == str1.length()){
            return count;
        }
        if(str1.charAt(i) == 'h' && str1.charAt(i+1) == 'i'){
            count++;
//            str1.replace(i,i+2,"");
//            System.out.println(str1);
//            str1.replace(i,i+2,"bye");
//            System.out.println(str1);
        }
        return remRepl(str1,i+1,count);

    }
    static StringBuilder remRepla(StringBuilder str1,int i){
        if(i == str1.length()){
            return str1;
        }
        if(str1.charAt(i) == 'h' && str1.charAt(i+1) == 'i'){
//            if(i == str1.length()-2){
//                StringBuilder str = new StringBuilder(str1.substring(0,str1.length()-2));
//                return str;
//
//            }
//            else{
//                str1.replace(i,i+2,"");
//            }

//            System.out.println(str1);
            str1.replace(i,i+2,"bye");
        }
        return remRepla(str1,i+1);

    }

}
