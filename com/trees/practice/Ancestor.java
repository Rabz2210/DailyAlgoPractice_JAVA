package com.trees.practice;

import java.util.ArrayList;

public class Ancestor {
    public static boolean pathFind(Node root,ArrayList<Integer>p, int data){
        if(root==null)return false;
        p.add(root.data);
        if(root.data==data)return true;
        if(pathFind(root.left,p,data) || pathFind(root.right,p, data)){
            System.out.print(" "+root.data);
            return true;
        }
        p.remove(p.size()-1);
        return false;
        
    }
    public static boolean anstr(Node root, int data){
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        if(root==null)return false;
        if(root.data==data)return true;
        if(anstr(root.left,data) || anstr(root.right, data)){
            System.out.print(" "+root.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        anstr(root, 7);
    }
    
}