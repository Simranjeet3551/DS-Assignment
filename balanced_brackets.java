package practice;
import java.util.*;
public class balanced_brackets 
{
   public static void main(String args[])
   {
	   Scanner s = new Scanner(System.in);
	   Stack<Character> st=new Stack<Character>();
	   String str=new String();
	   System.out.println("Enter the String:-");
	   str=s.next();
	   int n=str.length();
	   for(int i=0;i<n;i++)
	   {
		   char c= str.charAt(i);
		   if(c == '{'|| c == '[' || c == '(')
		   {
			   st.push(c);
		   }
		   else if(c == '}'&&st.peek()=='{'||c == ']'&&st.peek()=='['||c == ')'&&st.peek()=='(')
		   {
			   st.pop();
		   }	
	   }
	   if(st.isEmpty())
	   {
		   System.out.println("The String is BALANCED :-");
	   }
	   else
	   {
		   System.out.println("The String is NOT BALANCED :-");
	   }
	   }
	   
	   
   }

