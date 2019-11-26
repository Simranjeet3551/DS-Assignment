package achievers.in;
import java.util.*;
public class Sum_from_2_arrays_equals_k 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the first array:-");
		int n = s.nextInt();
		System.out.println("Enter the size of the second array:-");
		int m = s.nextInt();
		System.out.println("Enter the value of k:-");
		int k =s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		System.out.println("Enter the first array:-");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the second array:-");
		for(int j=0;j<m;j++)
		{
			b[j]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if((a[i]+b[j])==k)
				{
				 System.out.print(a[i]+" "+b[j]);	
				 System.out.print(",");
				 c++;
				}
			}
		}
		if(c==0)
		{
			System.out.println("There are not such pairs:-");
		}
	}
	
}
