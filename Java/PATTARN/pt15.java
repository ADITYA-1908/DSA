import java.util.Scanner;
public class pt15
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,row,n=1;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 1; i <=row; i++) 
        {
            for ( j = i; j <=row; j++) 
            {
                System.out.print(" ");    
            }
            for ( s = 1; s <=i; s++) 
            {
                System.out.print(n);
                n++;    
            }
            System.out.println();    

        }

    }
}