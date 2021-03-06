package com.trees.practice;
import java.util.LinkedList;
import java.util.Queue;


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
    public static int height(Node root){
        if(root ==null)return 0;
        else{
            return Math.max(height(root.left), height(root.right))+1;
        }
    }
    public static void BFS(Node root){
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            
            Node Parent =  q.poll();
            System.out.print(""+Parent.data+" ");
            
            if(Parent.left!=null)q.add(Parent.left);
            if(Parent.right!=null)q.add(Parent.right);
        }

        
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        System.out.println("Height of the binary tree: "+height(root));
        System.out.println("BFS: ");
        BFS(root);


    }
}