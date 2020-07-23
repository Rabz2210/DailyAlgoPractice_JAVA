class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int data){
        this.data = data;
    }
}


public class BinaryTreeFromInLevelordrTraversal {
    public static int lvlIndex = 0;
    public static Node2 buildTree(int[] inOrder,int[] lvlOrder,int inStart,int inEnd){
        if(inStart>inEnd)return null;
        Node2 n = new Node2(lvlOrder[lvlIndex++]);
        if(inStart==inEnd)return n;
        int inIndex = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if(inOrder[i]==n.data){inIndex=i;}
        }
        n.left = buildTree(inOrder, lvlOrder, inStart, inIndex-1);
        n.right = buildTree(inOrder, lvlOrder, inIndex+1, inEnd);
        return n;
    }
    
}