package practice;
import java.util.Scanner;

   class Node
   {
	   Node left,right;
	   int data;
	   Node(int d)
	   {
		   data=d;
		   left=right=null;
	   }
   }
   public class LeftViewOfBst 
   {
	   static Node root;
	   static int a=0;
	   LeftViewOfBst()
	   {
		   root=null;
	   }
	   LeftViewOfBst(int data)
	   {
		   root =new Node(data);
	   }
	   public static int heighttree(Node root)
	   {
		   int c1=0;
		   int c2=0;
		   if(root == null)
		   {
			   return 0;
		   }
		   c1=heighttree(root.left);
		   c1++;
		   c2=heighttree(root.right);
		   c2++;
		   if(c1>=c2)
		   {
			   return c1;
		   }
		   else
		   {
			   return c2;
		   }
	   }
		   public static void view(Node root)
		   {
			   int h=heighttree(root);
			   a=0;
			   for(int i=1;i<=h;i++)
			   {
                a=1;
                leftView(root,i);
			   
		   }
	   }
		   public static void leftView(Node root,int level)
		   {
			   if(root==null)
			   {
				   return;
			   }
			   else if(level==1 && a==1)
			   {
				   a++;
				   System.out.println(root.data);
			   }
			   else
			   {
				   leftView(root.left,level-1);
				   leftView(root.right,level-1);
			   }
		   }
	   
   
   public static void main(String args[])
   {
	   LeftViewOfBst lv=new LeftViewOfBst();
	   root=new Node(1);
       root.left=new Node(2);
       root.right = new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
	  System.out.println("left view of BST is:-");
	 view(root);
   }
}
