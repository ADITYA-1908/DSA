import java.util.Scanner;
public class pt2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 1; i <=row; i++) 
        {
            for ( j = 1; j <= i; j++) 
            {
                System.out.print(+j);    
            }
            System.out.println();    
        }
    }
}