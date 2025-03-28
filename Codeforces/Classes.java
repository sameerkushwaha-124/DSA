package Codeforces;
import java.util.*;
public class Classes{
    public static void theaterSquare() {
        long n, m, a;
        long c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        n = sc.nextInt();
        System.out.println("Enter the breath:");
        m = sc.nextInt();
        System.out.println("Enter the side of square tile:");
        a = sc.nextInt();
        if (n % a != 0) {
            d = n / a + 1;
        } else {
            d = n / a;
        }
        if (m % a != 0) {
            c = m / a + 1;
        } else {
            c = m / a;
        }
        System.out.println(d * c);
    }

    public static void watermelon() {
        Scanner sc = new Scanner(System.in);
        long w;
        System.out.println("Enter the weight of watermelon:");
        w = sc.nextInt();
        if (w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
        public static void superAgent() {
            char arr[][] = new char[3][3];
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the charecter:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] =scan.next().charAt(0);
                }
            }
            if (arr[0][0] == arr[2][2] && arr[0][1] == arr[2][1] && arr[0][2] == arr[2][0]
                    && arr[1][0] == arr[1][2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        public static void reconnaissanceUnit(){
            int n,st_pos=1,end_pos=2;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the no of soldier:");
            n=scan.nextInt();
            int min=Integer.MAX_VALUE;
            int arr[]=new int [101];
            for(int i=1;i<=n;i++){
                arr[i]=scan.nextInt();
            }
            for(int i=1; i<=n;i++){
                int j=i+1;
                if(j>n){
                    j=1;
                }
                if(Math.abs(arr[i]-arr[j])<min){
                    min=Math.abs(arr[i]-arr[j]);
                    st_pos=i;
                    end_pos=j;
                }
            }
        System.out.println(st_pos +" "+end_pos);
    }

    public static void  chips(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of animals:");
        int animal=scan.nextInt();
        System.out.println("Enter the number of chips:");
        int chips=scan.nextInt();
        int sum=animal*(animal+1)/2;
        if(sum>chips){
            for(int i=1;i<=animal;i++){
                if(chips>=i){
                    chips=chips-i;
                }
            }
            System.out.println(chips);
        }
        else{
            int div=chips/sum;
            int new_chips=chips-div*sum;
            for(int i=1;i<=animal;i++){
                if(new_chips>=i){
                    new_chips=new_chips-i;
                }
            }
            System.out.println(new_chips);
        }
    }
    public static void haiku(){
        int count=0;
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        String str3=scan.nextLine();
        char ch1[]=str1.trim().toCharArray();
        char ch2[]=str2.trim().toCharArray();
        char ch3[]=str3.trim().toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]=='a' || ch1[i]=='e' ||ch1[i]=='i' ||ch1[i]=='o' ||ch1[i]=='u'){
                count++;
            }
        }
        int count1=0;
        for(int i=0;i<ch2.length;i++){
            if(ch2[i]=='a' || ch2[i]=='e' ||ch2[i]=='i' ||ch2[i]=='o' ||ch2[i]=='u'){
                count1++;
            }
        }
        int count2=0;
        for(int i=0;i<ch3.length;i++){
            if(ch3[i]=='a' || ch3[i]=='e' ||ch3[i]=='i' ||ch3[i]=='o' ||ch3[i]=='u'){
                count2++;
            }
        }
        if(count==5 && count1==7 && count2==5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }


        public static void main(String[] args){
            // https://codeforces.com/problemset/problem/1/A
            // Classes.theaterSquare();

            // https://codeforces.com/contest/4/problem/A
            //Classes.watermelon();

            // https://codeforces.com/contest/9/problem/A
            //Classes.superAgent();

            // https://codeforces.com/contest/34/problem/A
            // Classes.reconnaissanceUnit();


            //Classes.chips();

            Classes.haiku();






    }
}


