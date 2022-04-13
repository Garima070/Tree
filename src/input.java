import java.util.Random;
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
public class input {
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
    public static void main(String[] args) {
      //  static Scanner sc=null;
       sc=new Scanner(System.in);
       Node tree=create();
    }
}

