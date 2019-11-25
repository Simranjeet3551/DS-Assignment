package achievers.in;
import java.util.*;
public class prefix_to_postfix 
{
	public static void prefixtopostfix(String str)
	
	{
		Stack<String> stk=new Stack<String>();
		String result="";
		String a="";
		String b="";
		for(int i=str.length()-1;i>=0;i--)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='0' && str.charAt(i)<='9'))
			{
				String st="";
				st=st+str.charAt(i);
				stk.push(st);
				
			}
			else
			{
				if(!stk.empty())
				{
					a=stk.pop();
				}
				if(!stk.empty())
				{
					b=stk.pop();
				}
				result=a+b+str.charAt(i);
				stk.push(result);
				
			}
		}
		System.out.println("The string in postfix:-");
		System.out.println(stk.pop());
	
	}	
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Prefix:-");
	String str=s.next();
	prefixtopostfix(str);
}
}
