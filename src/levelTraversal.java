import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node5
{
    int data;
    Node right;
    Node left;
    Node5(int data)
    {
        this.data=data;
    }
}
public class levelTraversal{
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
    public static void leveltraversal(Node root)
    {
        Queue q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            Node curr= (Node) q.poll();
            System.out.print(curr.data + " ");
            if(curr.left!= null) {
                q.add(root.left);
            }
            if(curr.right!= null) {
                q.add(root.right);
            }
        }
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        leveltraversal(root);
    }
}

