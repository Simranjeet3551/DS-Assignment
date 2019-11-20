package achievers.in;
import java.util.*;
class Node
	 {
		 int data;
		 Node left;
		 Node right;
		 Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	 }
	 public class check_bst
	 {
		 static Node root;
		 static ArrayList<Integer> a=new ArrayList<Integer>();
		 check_bst()
		 {
			 root= null;
		 }
		 check_bst(int d)
		 {
			 root=new Node(d);
		 }
		 public static void insert(int key)
		 {
			 root = insertItem(root,key);
		 }
		 public static  Node insertItem(Node root,int key)
		 {
			 if(root==null)
			 {
				 root=new Node(key);
				 return root;
			 }
			 else if(root.left==null)
			 {
				 root.left=insertItem(root.left,key);
			 }
			 else
			 {
				 root.right=insertItem(root.right,key);
			 }
			 return root;
		 }
	 public static void inOrder(Node root)
	 {

	     if(root!=null)
	     {
	    	 inOrder(root.left);
	    	 System.out.println(root.data);
	    	 a.add(root.data);
	    	 inOrder(root.right);
	     }
	     return;
	 }
	 public static boolean checktree(ArrayList<Integer>a)
	 {
		 for(int i=0;i<a.size()-1;i++)
		 {
			if(a.get(i)<a.get(i+1))
			{
				continue;
			}
			else
			{
				return false;
			}
			
		 }
		 return true;
	 }
	 public static void main(String args[])
	 {
		 check_bst t=new check_bst();
		 t.root=new Node(100);
		 
		 t.root.left = new Node(70);
		 t.root.right = new Node(120);
		 
		 t.root.left.left = new Node(50);
		 t.root.left.right = new Node(80);
		 t.root.right.right = new Node(170);
		 t.root.right.left = new Node(110);
		 System.out.println("inOrder");
		 inOrder(root);
		 System.out.println();
		 if(checktree(a))
		 {
			 System.out.println("The given binary tree is BST");
		 }
		 else
		 {
			 System.out.println("The given binary tree is not BST");
		 }
	 }
	}

