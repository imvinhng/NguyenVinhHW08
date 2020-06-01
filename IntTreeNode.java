/*
 * ==========================================
 * CS211, Spring 2020, 5/31
 * Vinh T. Nguyen
 * Homework 08 - Chap 17 EX 1,5,8
 * Exercise 1 - countLeftNodes method return number of left children in the left node
 * Exercise 5 - printLevel(int n) prints the values at level n from left to right
 * Exercise 8 - toString method that prints out the entire binary tree as a String
 * return data in a leaf node as a string, return parathesized String with three elements seperated by commas
 * for branch nodes: roots, left subtree, right subtree
 * ==========================================
 */
// Class for storing a single node of a binary tree of ints

public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
                
    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                        
    // constructs a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left, 
                       IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
