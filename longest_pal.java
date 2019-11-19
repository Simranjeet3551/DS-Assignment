package achievers.in;

import java.util.Scanner;

public class longest_pal 
{
 static boolean checkpalin(String str)
 {
	 String res="";
	 int n = str.length();
	 for(int i=n-1;i>=0;i--)
	 {
		 res= res+str.charAt(i);
	 }
	 if(res.contentEquals(str))
	 {
		return true;
	 }
	 else
	 {
		 return false;
	 }
 }
	 static String palin(String st)
	 {
		 int n=st.length();
		 int max=0;
		 String palin="";
		 String t="";
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<=n;j++)
			 {
				 if(checkpalin(st.substring(i,j)))
				 {
					 t=st.substring(i,j);
					 if(t.length()>max)
					 {
						 max=t.length();
						 palin=t;
					 }
				 }
			 }
		 }
		 if(palin.length()<=1)
			 return "No palindrome";
		 else
			 return palin;
	 }
	 public static void main(String args[])
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the string:");
		 String ss=s.next();
		 
		 System.out.println(palin(ss));
	 }
 }
	

