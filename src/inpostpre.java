import java.util.Scanner;

class Node1
        {
        int data;
        Node right;
        Node left;
        Node1(int data)
        {
        this.data=data;
        }
        }
public class inpostpre {
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
    public static void inOrder(Node root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=create();
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("preorder");
        preOrder(root);
        System.out.println();
        System.out.println("postorder");
        postOrder(root);
    }
}

