import java.util.Scanner;

public class evenodd 
{
    public static void main(String[] args) 
    {
        int num;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num %2 ==0)
        {
            System.out.println(num+"the number is even");    
        }
        else
        {
            System.out.println(num+"the number is odd");
        }
    }
    
}
