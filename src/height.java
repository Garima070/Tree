import java.util.Scanner;

class Node3
{
    int data;
    Node right;
    Node left;
    Node3(int data)
    {
        this.data=data;
    }
}
public class height {
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
    public static int Height(Node root)
    {
        if(root==null)
            return 0 ;
        int l=Height(root.left);
        int r=Height(root.right);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int n= Height(root);
        System.out.println(n);
    }
}

