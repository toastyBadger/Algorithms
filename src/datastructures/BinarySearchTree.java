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

    public E get(K key) {
        return get(key, root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.size;
        }
    }

    private Node insert(K key, E value, Node node) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int compareResult = node.key.compareTo(key);
        if (compareResult == 0) {
            node.value = value;
        } else if (compareResult > 0) {//new key is less than in current node
            node.left = insert(key, value, node.left);
        } else if (compareResult < 0) {
            node.right = insert(key, value, node.right);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    private E get(K key, Node node) {
        if (node != null) {
            int compareResult = node.key.compareTo(key);
            if (compareResult == 0) {
                return node.value;
            } else if (compareResult > 0) {//new key is less than in current node
                return get(key, node.left);
            } else if (compareResult < 0) {
                return get(key, node.right);
            }
        }
        return null;
    }
}
