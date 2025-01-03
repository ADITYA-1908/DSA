import java.util.Scanner;
public class sort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max,j,temp;
        System.out.println("enter no of element");
        n=sc.nextInt();
        int arr[]=new int[10];
        System.out.println("enter the element in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" element present in the array are");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
	    }
		System.out.println("sorted array");
		for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
		System.out.println();
	}
}