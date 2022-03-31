import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodes {
    static class Node{
        private final int data;
        int root;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
                return null;
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    public static int sum(Node root)
    {
        if(root==null)
            return 0;
        int lnode=sum(root.left);
        int rnode=sum(root.right);
        return lnode+rnode+root.data;
    }
    public static void main(String[] args) {
        int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root =tree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println(sum(root));;
    }
}

