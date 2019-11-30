package practice;
import java.util.Scanner;

	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
		}
	}
	public class lowestcommonancestor 
	{
		static Node root;
		lowestcommonancestor()
		{
			root=null;
		}
        static Node lca(Node root,int a,int b)
        {
        	if(root==null)
        	{
        		return root;
        		
        	}
        	if(root.data==a||root.data==b)
        	{
        		return root;
        	}
        	Node l=lca(root.left,a,b);
        	Node r=lca(root.right,a,b);
        	if(l!=null && r!=null)
        	{
        		return root;
        	}
              if(l!=null)
              
            	  return l;
              
              else 
            	  return r;
        
	}
        public static void main(String args[])
        {
        Scanner s=new Scanner(System.in);
        lowestcommonancestor t=new lowestcommonancestor();
        root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Enter the Nodes to find lca:-");
        int a=s.nextInt();
        int b =s.nextInt();
        Node lowans=lca(root,a,b);
        System.out.println("the lca of "+ a+ " and "+ b+ " is " +lowans.data);
        }
}
