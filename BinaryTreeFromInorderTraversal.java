import java.util.Arrays;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
public class BinaryTreeFromInorderTraversal {
    public static Node buildTree(int[] pre,int[] InOrder,int inStart,int inEnd){
        if(inStart>inEnd)return null;
        Node n = new Node(pre[inStart]);
        inStart++;
        if(inStart==inEnd)return n;
        int inIndex=0;
        for(int i=0;i<InOrder.length;i++){
            if(pre[inStart]==InOrder[i])
              inIndex = i;
        }
        Node left = buildTree(pre,InOrder,inStart,inIndex-1);
        Node Right = buildTree(pre,InOrder,inIndex+1,inEnd);
        return n;
    }
    public static void main(String[] args) {
        
    }
}