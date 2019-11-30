package achievers.in;
import java.util.Scanner;
public class linkedlistsum {

    public static class Node
    {
        int data;
    Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
   public static linkedlistsum insert(linkedlistsum li,int data)
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
public static  void  display(linkedlistsum li)
    {
        Node temp=li.head;
        while(temp.next!= null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public static linkedlistsum sumofLL(linkedlistsum li1,linkedlistsum li2)
    {
    	Node curr1=li1.head;
    	Node curr2=li2.head;
    	int count1=0;
    	int count2=0;
    	int sum1=0;
    	int sum2=0;
    	int total=0;
    	while(curr1!=null)
    	{
    		sum1=(int)(sum1+curr1.data*Math.pow(10,count1));
    		count1++;
    		curr1=curr1.next;
    	}
    while(curr2!=null)
    {
    	sum2=(int)(sum2+curr2.data*Math.pow(10,count2));
		count2++;
		curr2=curr2.next;
    }
   total=sum1+sum2;
   linkedlistsum li=new linkedlistsum();
   while(total!=0)
   {
	   li.insert(li, (total%10));
	   total=total/10;
	   
   }
   return li;
    }
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	linkedlistsum li1=new linkedlistsum();
    	linkedlistsum li2=new linkedlistsum();
    	linkedlistsum li3=new linkedlistsum();
    	System.out.println("enter the no of elements u want to insert in li1:-");
    	int n=s.nextInt();
    	System.out.println("enter the elements in li1");
    	for(int i=0;i<n;i++)
    	{
    		li1.insert(li1, s.nextInt());
    	}
    	System.out.println("enter the no of elements u want to insert in li1:-");
    	int n1=s.nextInt();
    	System.out.println("enter the elements in li2");
    	for(int i=0;i<n1;i++)
    	{
    		li2.insert(li2, s.nextInt());
    	}
    li3=sumofLL(li1,li2);
    display(li3);
  
	}
    
}


