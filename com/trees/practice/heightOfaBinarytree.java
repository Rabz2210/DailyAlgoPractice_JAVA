package com.trees.practice;

public class heightOfaBinarytree {
    public static int hgBinary(Node root){
        if(root==null)return 0;
        int height=1;
        return (height+Math.max(hgBinary(root.left), hgBinary(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        System.out.println("height : "+hgBinary(root));
    }
}