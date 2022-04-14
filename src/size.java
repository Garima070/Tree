import java.util.Scanner;

class Node
{
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
    }
}
public class size{
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
    public static int Size(Node root)
    {
        if(root==null)
            return 0 ;
        int l=Size(root.left);
        int r=Size(root.right);
        return l+r+1;
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int n= Size(root);
        System.out.println(n);
    }
}

