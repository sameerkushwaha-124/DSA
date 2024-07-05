//* * * * *
//* * * *
//* * *
//* *
//*




        package Pattern;

public class pattern7 {
    public static void main(String args[])
    {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int star=1;
            while(star<=(n+1)-row)
            {
                System.out.print("* ");
                star+=1;
            }
            System.out.println();
            row+=1;
        }
    }
}
