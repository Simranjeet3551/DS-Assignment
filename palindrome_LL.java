package com.in;
import java.util.*;

import com.in.LinkedList2.Node;
public class palindrome_LL 
{
	    Node head;
	    public static class Node
	    {
	        int data;
	    Node next;
	        Node(int d)
	        {
	            data=d;
	        }
	    }
	    public static palindrome_LL insert(palindrome_LL li,int data)
	    {
	        Node newNode=new Node(data);
	        newNode.next=null;
	        if(li.head == null)
	        {
	            li.head=newNode;
	        }
	        else
	        {
	            Node last=li.head;
	            while(last.next!=null)
	            {
	                last=last.next;
	            }
	            last.next=newNode;
	        }
	        return li;
	    }
	    public static void  display(palindrome_LL li)
	    {
	        Node temp=li.head;
	        while(temp != null)
	        {
	            System.out.println(temp.data);
	            temp=temp.next;
	        }
	    
	    }
	    public static palindrome_LL addBeg(palindrome_LL li,int data)
	    {
	    	Node newNode=new Node(data);
	    	if(li.head==null)
	    	{
	    		li.head=newNode;
	    	}
	    	
	    	else         
	    	{
	    		newNode.next=li.head;
	    		li.head=newNode;
	    	}
	    	return li;
	    	
	    }
	    public static void check_pal(palindrome_LL li,palindrome_LL li1)
	    {
	    	Node a=li.head;
	    	Node b=li1.head;
	    	while(a!=null)
	    	{
	    		if(a.data == b.data)
	    		{
	    			a=a.next;
	    			b=b.next;
	    		}
	    		else
	    		{
	    			break;
	    		}
	    	}
	    	if(a==null)
	    	{
	    		System.out.println("The linked list is Palindrome...");
	    	}
	    	else
	    	{
	    		System.out.println("The linked list not is Palindrome...");
	    	}
	    	
	    }
	    public static void main(String args[])
	    {
	    	Scanner s=new Scanner(System.in);
	    	palindrome_LL li=new palindrome_LL();
	    	palindrome_LL li1=new palindrome_LL();
	    	System.out.println("Enter the Number of Elements:-");
	    	int n1=s.nextInt();	    	
	    	System.out.println("Enter the Elements:-");
	    	for(int i=0;i<n1;i++)
	    	{
	    		int n=s.nextInt();
	    		li.insert(li,n);
	    		li1.addBeg(li1,n);
	    	}
check_pal(li,li1);
	        

		}
	    
	}
