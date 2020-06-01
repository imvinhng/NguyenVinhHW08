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
 
// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree t = new IntTree(15);
//          System.out.println("Tree structure:");
//          t.printSideways();
//         System.out.println();
//         t.printPreorder();
//         t.printInorder();
//         t.printPostorder();
        
       // Exercise 1 - countLeftNodes method return number of left children in the left node
       System.out.println(t.countLeftNodes()); //7
       
       // Exercise 5 - printLevel(int n) prints the values at level n from left to right
        t.printLevel(3); //4 5 6 7
        System.out.println();
       
       // Exercise 8 - toString method that prints out the entire binary tree as a String
       // return data in a leaf node as a string, return parathesized String with three elements seperated by commas
       // for branch nodes: roots, left subtree, right subtree
       System.out.println(t.toString());

        
        
        
    }
}
