package achievers.in;
import java.util.*;
public class Freq_duplicate
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elemnets:");
	int n =s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements:");
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++)
    {
    	temp=1;
    	for(int j=i+1;j<n;j++)
    	{

    		if(a[i]==a[j])
    		{
    			temp++;
    			if(temp>=1)
    			{
    				a[j]=0;
    			}
    		}
    		}
    	if(temp>=1 && a[i]!=0)
    	{
    		System.out.println("element"+" "+a[i]+" occurs "+temp+" times" );
    	}
    }
}
}
