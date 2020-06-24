
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class BinaryTreeImpl {
    public static void PreOrderTraversal(Node root){
  
        if(root==null)return;
        System.out.print(""+root.data);
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    public static void InOrderTraversal(Node root){
    
        if(root==null)return;
        InOrderTraversal(root.left);
        System.out.print(""+root.data);
        InOrderTraversal(root.right);
    }
    public static void PostOrderTraversal(Node root){
      
        if(root==null)return;
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(""+root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        System.out.println("Pre-Order Traversal: ");
        System.out.println();
        BinaryTreeImpl.PreOrderTraversal(root);
        System.out.println("In-Order Traversal: ");
        System.out.println();
        BinaryTreeImpl.InOrderTraversal(root);
        System.out.println("Post-Order Traversal: ");
        System.out.println();
        BinaryTreeImpl.PostOrderTraversal(root);

    }
}