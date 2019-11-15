package practice;
	import java.util.*;
	public class reverse_without_characters
	{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			char a[]=new char[s.length()];
			char b[]=new char[s.length()];
			int count=0;
			int count1=0;
			int n;
			for(int i=0;i<s.length();i++)
			{
			    n=s.charAt(i);
			    if(n>=97 && n<=122)
			    {
			        a[count]=s.charAt(i);
			        ++count;
			    }
			}
			--count;
			for(int i=0;i<s.length();i++)
			{
			    n=s.charAt(i);
			    if(n>=90 && n<=122)
			    {
			        System.out.print(a[count]);
			        --count;
			    }
			        if(n<90 || n>122)
			    {
			        System.out.print(s.charAt(i));
			    }
			}
		}
	}


