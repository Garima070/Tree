import java.util.Scanner;

class Node4
{
    int data;
    Node right;
    Node left;
    Node4(int data)
    {
        this.data=data;
    }
}
public class maxNode{
    static Scanner sc=null;

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
    public static int maxnode(Node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxnode(root.left),maxnode(root.right)));
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int n=  maxnode(root);
        System.out.println(n);
    }
}

