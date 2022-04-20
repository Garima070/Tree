import java.util.Scanner;

class Node14
{
    int data;
    Node right;
    Node left;
    Node14(int data)
    {
        this.data=data;
    }
}
public class floorCeilValue{
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
   public static int floor(Node root,int x)
   {
       int ans=Integer.MAX_VALUE;
       while (root != null)
       {
           if(root.data==x)
               return root.data;
           if(root.data>x)
               root=root.left;
           else
           {
               ans=root.data;
               root=root.right;
           }
       }
       return ans;
   }
    public static int ceil(Node root,int x)
    {
        int ans=Integer.MIN_VALUE;
        while (root != null)
        {
            if(root.data==x)
                return root.data;
            if(root.data>x) {
                ans = root.data;
                root = root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //  static Scanner sc=null;
        sc=new Scanner(System.in);
        Node root=create();
        int x=sc.nextInt();
        System.out.println(floor(root,x));
        System.out.println(ceil(root,x));
    }
}

