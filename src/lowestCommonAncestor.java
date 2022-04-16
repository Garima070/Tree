import java.util.Scanner;

class Node9
{
    int data;
    Node right;
    Node left;
    Node9(int data)
    {
        this.data=data;
    }
}
public class lowestCommonAncestor{
    static Scanner sc=null;
    static Node head;
    static Node prev=null;

    public static Node create()
    {
        Node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("enter left for data "+data);
        root.left=create();
        System.out.println("enter right for data "+data);
        root.right=create();
        return root;
    }
   public static Node ances(Node root,int n1,int n2)
   {
       if(root.data==n1 || root.data==n2)
           return root;
       if(root==null)
           return null;
       Node l=ances(root.left,n1,n2);
       Node r=ances(root.right,n1,n2);
       if(root.left==null)
           return root.right;
       if(root.right==null)
           return root.left;
       return root;
   }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Node n=ances(root,n1,n2);
        System.out.println(n.data);
    }
}

