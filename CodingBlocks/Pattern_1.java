package CodingBlocks;

public class Pattern_1 {
    public static void main(String[] args) {
        int n = 99;
        int row = 1;
        while(row <= n){

            int column = 1;
            while(column <= n){

                if(row == (n+1)/2 || column == (n+1)/2 || column == 1 && row < n/2 +1 ||
                        row == 1 && column >= n/2+1 || row == n && column < n/2+1 ||
                        row >= n/2+1 && column == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
