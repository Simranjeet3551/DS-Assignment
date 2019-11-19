package achievers.in;

import java.util.Scanner;

public class rotate_ll 
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
    public static rotate_ll insert(rotate_ll li,int data)
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
    public static rotate_ll rotate(rotate_ll li,int key)
    {
    	for(int i=0;i<key;i++)
    	{
    		Node t=li.head;
    		Node pre = null;
    		while(t.next!= null)
    		{
    			pre=t;
    			t= t.next;
    		}
    		pre.next=null;
    		t.next=li.head;
    		li.head=t;
    		
    	}
    	return li;
    }
    public static void  display(rotate_ll li)
    {
        Node temp=li.head;
        while(temp != null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    
    }
    public static void main(String args[])
    {
    	rotate_ll li=new rotate_ll();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of elements:");
        int n = s.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
        	int number= s.nextInt();
        	li=insert(li,number);
        }
        System.out.println("Enter the number of rotations You want:");
        int key=s.nextInt();
        li=rotate(li,key);
        display(li);

	}
    
}
