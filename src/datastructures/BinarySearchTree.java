/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author MrKnyaz
 */
public class BinarySearchTree<K extends Comparable, E> {

    private Node root;

    private class Node {

        K key;
        E value;
        Node right;
        Node left;
        int size;

        public Node(K key, E value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }

    public void put(K key, E value) {
        root = insert(key, value, root);
    }

    private Node insert(K key, E value, Node node) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int compareResult = node.key.compareTo(key);
        if (compareResult == 0) {
            node.value = value;
        } else if(compareResult > 0) {//new key is less than in current node
            node.left = insert(key, value, node.left);
        } else if (compareResult < 0) {
            node.right = insert(key, value, node.right);
        }
        return node;
    }
}
