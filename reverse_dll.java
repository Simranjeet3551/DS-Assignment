package achievers.in;
import java.util.Scanner;
public class reverse_dll 
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
	    public static reverse_dll insert(reverse_dll li,int data)
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
	    public static reverse_dll reverse(reverse_dll li)
	    {
	    	Node prev=null,next=null,current=li.head;
	    	while(current!=null)
	    	{
	    		next=current.next;
	    		current.next=prev;
	    		prev=current;
	    		current=next;
	    	}
	    	li.head=prev;
	    	return li;
	    }
	    public static void  display(reverse_dll li)
	    {
	        Node temp=li.head;
	        while(temp != null)
	        {
	            System.out.println(temp.data+"  ");
	            temp=temp.next;
	        }
	    
	    }
	    public static void main(String args[])
	    {
	    	reverse_dll li=new reverse_dll();
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the Number of elements:");
	        int n = s.nextInt();
	        System.out.println("Enter the elements:");
	        for(int i=0;i<n;i++)
	        {
	        	int number= s.nextInt();
	        	li=insert(li,number);
	        }
	        System.out.println("Doubly linked list before reversing:-");
	        display(li);
	        li=reverse(li);
	        System.out.println("Doubly linked list after reversing:-");
	        display(li);

		}
	    
	}


