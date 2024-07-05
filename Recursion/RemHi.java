package Recursion;

public class RemHi {
    public static void main(String[] args) {
        System.out.println("abchihitfhi");
        int value = count("abchihithihiiihitii",0,0);
        System.out.println(value);
    }

    static int count(String str,int i,int count){
        if(i == str.length()-2){
            return count;
        }
        if( i == str.length()-3 && str.charAt(str.length()-2) == 'h' && str.charAt(str.length()-1) == 'i'){
            return ++count;
        }
        if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i' &&
                str.charAt(i+2) != 't'){
            return count(str,i+1,count+1);
        }
        return count(str,i+1,count);
    }

    static void replace(String str,int i){
        if(i == str.length()-2){
            System.out.println(str);
            return ;
        }
        if( i == str.length()-3 || str.charAt(str.length()-2) == 'h' && str.charAt(str.length()-1) == 'i'){
            return;
        }
    }
}
