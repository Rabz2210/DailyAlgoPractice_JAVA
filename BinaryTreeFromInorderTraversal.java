import java.util.Arrays;

class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data = data;
    }
}
public class BinaryTreeFromInorderTraversal {
    static int preIndex = 0;
    public static Node1 buildTree(int[] pre,int[] InOrder,int inStart,int inEnd){
        if(inStart>inEnd)return null;
        Node1 n = new Node1(pre[preIndex]);
        preIndex++;
        if(inStart==inEnd)return n;
        int inIndex=0;
        for(int i=0;i<InOrder.length;i++){
            if(pre[inStart]==InOrder[i]){inIndex = i;}
        }
        Node1 left = buildTree(pre,InOrder,inStart,inIndex-1);
        Node1 Right = buildTree(pre,InOrder,inIndex+1,inEnd);
        return n;
    }
    public static void inOrderTraversal(Node1 root){
        if(root==null)return;
        else{
            inOrderTraversal(root.left);
            System.out.println(""+root.data);
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int[] inOrder = new int[]{40,20,50,10,30};
        int[] preOrder = new int[]{10,20,40,50,30};
        System.out.println("Building Tree");
        Node1 root = buildTree(preOrder, inOrder, 0, inOrder.length-1);

        System.out.println("Displaying tree");
        inOrderTraversal(root);
    }
}