package achievers.in;
import java.util.Scanner;
public class Count_max_greater_than_k 
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n =s.nextInt();
int a[]=new int[n+1];
System.out.println("Enter the elements of the array:-");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the value of the K:-");
int k=s.nextInt();
int max;
int count=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		max=0;
		for(int l=i;l<=j;l++)
		{
			if(a[l]>max)
			{
				max=a[l];
			}
			if(max>k)
			{
				count++;
			}
		}
	}
  }
 
System.out.println("There are only "+count+ " elements greater than "+k);

}
}