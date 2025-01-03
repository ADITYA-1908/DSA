import java.util.Scanner;

public class automorphicnum
{
    public static void main(String[] args)
    {
        int n, sq, temp,op,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        temp=n;        
        while (temp > 0)
        {
            temp=temp/10;
            c++;
        }
        sq = n * n;
        op= sq%(int)Math.pow(10, c);
        if(op==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
        
        
    }
}