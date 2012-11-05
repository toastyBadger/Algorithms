/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import datastructures.MinPriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Knyazev Alexander <aknyazev@kkb.kz>
 */
public class Prim {
    
    int V;
    int E;
    LinkedList<Edge>[] adj;
    MinPriorityQueue<Edge> pq;
    Queue<Edge> tree;
    byte[] used;
    
    
    public Prim(int vertices, int edges, LinkedList[] adjList) {
        V = vertices;
        E = edges;
        adj = adjList;
        used = new byte[V];
    }
    
    public void calculateMST() {
        int current = 0;
        
    }
    
}
