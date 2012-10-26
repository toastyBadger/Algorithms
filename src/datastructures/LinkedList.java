/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author MrKnyaz
 */
public class LinkedList<T> {

    private long size;
    private Node first;
    private Node last;

    private class Node {

        T item;
        Node next;
        Node previous;
    }

    public void add(T item) {
        if (first == null) {
            first = new Node();
            first.item = item;
            last = first;
        } else {
            Node newNode =  new Node();
            newNode.item = item;
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
    }

    public void reverseList() {
        //for double-linked
        Node current = first;        
        while (current != null) {
            Node temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.previous;
        }        
        //for single-linked
        /*Node current = first;
        Node previous = null;
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }*/
        Node temp = first;
        first = last;
        last = temp;
    }
    public void write() {
        for (Node x = first; x != null; x = x.next) {
            System.out.println(x.item);
        }
    }
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public long getSize() {
        return size;
    }
}
