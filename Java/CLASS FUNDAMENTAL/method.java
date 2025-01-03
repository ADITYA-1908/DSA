class add
{
    int a,b;
    int sum()
    {
        return a+b;
    }
}
public class method
{
   public static void main(String[] args) 
    {
        int sum;
        add ad=new add();
        ad.a=10;
        ad.b=20;
        sum=ad.sum();
        System.out.println(sum); 
    }
}