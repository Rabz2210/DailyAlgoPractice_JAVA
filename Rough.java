
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}

class Rough{
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(30);
        root.left = new Node(40);
        root.left.left = new Node(70);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right =  new Node(80);
        preOrder(root);

    }
}