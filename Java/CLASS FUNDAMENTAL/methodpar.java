class add
{
    int a,b;
    int sum()
    {
        return a+b;
    }
   add(int c,int d)
    {
        a=c;
        b=d;
    }
}
public class methodpar
{
   public static void main(String[] args) 
    {
        int sum;
        add ad1=new add(10,20);
        add ad2=new add(5,5);
        sum=ad1.sum();
        System.out.println(sum); 
        sum=ad2.sum();
        System.out.println(sum);   
    }
}