import java.util.Scanner;

class Node7
{
    int data;
    Node right;
    Node left;
    Node7(int data)
    {
        this.data=data;
    }
}
public class flattenTree{
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
    public static void doublylinkedlist(Node root)
    {
        if(root==null)
            return;
        doublylinkedlist(root.left);
        if(prev==null)
            head=root;
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        doublylinkedlist(root.right);
    }
    public static void printlist(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.right;
        }
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        doublylinkedlist(root);
        printlist(head);
    }
}

