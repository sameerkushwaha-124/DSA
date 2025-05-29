package Hashing;

public class HashingChar {
    public static void main(String[] args) {
                                     //             for small subtract : 'a' else 'A'
        int arr[] = new int[26];    //              [0,0,0,0,........26 times] now do mapping
        String str = "abcdabcfghyb";//              [a,b,c,d,........z  times] str.charAt(i)-'a'
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            arr[val]++;
        }

        String given = "abcd";
        System.out.println("Given: "+ given);
        System.out.print("Respective Frequency : ");
        for(int i = 0; i < given.length(); i++){
            System.out.print(arr[str.charAt(i)-'a']+" ");
        }
        System.out.println();
        System.out.println('A'+'a');

        System.out.println((char)(0 + 'a'));
    }
}
