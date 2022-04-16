import java.util.ArrayList;
import java.util.Scanner;

class Node8
{
    int data;
    Node right;
    Node left;
    Node8(int data)
    {
        this.data=data;
    }
}
public class diameterOfTree{
    static Scanner sc=null;

    public static Node create() {
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("enter left for data " + data);
        root.left = create();
        System.out.println("enter right for data " + data);
        root.right = create();
        return root;
    }
    public static int diametre(Node root)
    {
        if(root==null)
            return 0;
        int dial=diametre(root.left);
        int diar=diametre(root.right);
        int Height=height(root.left)+height(root.right)+1;
        return Math.max(Height,Math.max(dial,diar));
    }
    public static int height(Node root)
    {
        if(root==null)
            return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int n=diametre(root);
        System.out.print(n);
    }
}

