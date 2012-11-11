/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author MrKnyaz
 */
public class BinarySearchTree<T extends Comparable> {
    
    private int size;
    private Node root;
    
    private class Node {

        T item;
        Node right;
        Node left;
        int height;
    }
    
    public void insert(T item) {
        
    }
}
