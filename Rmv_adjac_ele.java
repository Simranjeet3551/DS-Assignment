package achievers.in;
import java.util.*;
public class Rmv_adjac_ele
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the String:-");
	   String str=s.next();
	   String result="";
	   if(str.charAt(0)!=str.charAt(1))
	   
		   result =result+str.charAt(0);
	   for(int i=1;i<str.length()-1;i++)
	   {
		   if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1))
			   result=result+str.charAt(i);
	   }
	   if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
		   result= result+str.charAt(str.length()-1);
	   System.out.println("The string after removing the adjacent elements:-"+result);
   }
}
