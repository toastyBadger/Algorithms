/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import datastructures.MinPriorityQueue;
import java.util.AbstractQueue;
import java.util.Iterator;
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
    Queue<Edge> tree = new LinkedList();
    boolean[] used;

    public Prim(int vertices, int edges, LinkedList[] adjList) {
        V = vertices;
        E = edges;
        adj = adjList;
        pq = new MinPriorityQueue(E);
        used = new boolean[V];
    }

    public void calculateMST() {
        visit(0);
        while (!pq.isEmpty()) {
            Edge edge = pq.popMin();
            if (used[edge.getV()] && used[edge.getW()]) {
                continue;
            }
            tree.add(edge);
            if (!used[edge.getV()]) {
                visit(edge.getV());
            } else {
                visit(edge.getW());
            }
        }

    }

    private void visit(int vertice) {
        used[vertice] = true;
        Iterator<Edge> edges = adj[vertice].iterator();
        while (edges.hasNext()) {
            Edge edge = edges.next();
            if (!used[edge.getOther(vertice)]) {
                pq.add(edge);
            }
        }
    }
    
    public void write() {
        System.out.println("V W Weight");
        Iterator<Edge> edges = tree.iterator();
        while (edges.hasNext()) {
            Edge edge = edges.next();
            System.out.println(edge.getV()+" "+edge.getW()+" "+edge.getWeight());
        }
    }
}
