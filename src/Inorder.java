public class Inorder {
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
    public static void inorder(Node root)
    {
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root =tree.buildtree(nodes);
        System.out.println(root.data);
        inorder(root);
    }
}
