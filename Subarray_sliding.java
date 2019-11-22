package achievers.in;
import java.util.*;
public class Subarray_sliding 
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the size of the array:-");
	   int n=s.nextInt();
	   System.out.println("Enter the size of the window:-");
	   int k =s.nextInt();
	 
	   int a[]=new int[n+1];
	   System.out.println("Enter the elements of the array:-");
	   for(int i=0;i<n;i++)
	   {
		   a[i]=s.nextInt();
	   }
	
	   for(int i=0;i<=n-k;i++)
	   {
		   int maximum=a[i];
		   for(int j=i;j<i+k;j++)
		   {
			   if(a[j]>maximum)
			   {
				   maximum=a[j];
			   }
		   }
	   System.out.print(maximum+" ");
	   }
}
}
