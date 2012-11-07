/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import sorting.MergeSort;

/**
 *
 * @author MrKnyaz
 */
public class Kruskal {

    public Edge[] edges;
    public int[] vertices;
    Queue<Edge> tree = new LinkedList();

    private boolean differentSets(int v, int w) {
        if (vertices[v] == vertices[w]) {
            return false;
        } else {
            return true;
        }
    }

    private void union(int v, int w) {
        int setOne = vertices[v];
        int setTwo = vertices[w];
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == setTwo) {
                vertices[i] = setOne;
            }
        }
    }

    public Kruskal(int V, Edge[] edges) {
        vertices = new int[V];
        for (int i = 0; i < V; i++) {
            vertices[i] = i;
        }
        this.edges = edges;
        MergeSort.sort(edges);
        for (int i = 0; i < edges.length; i++) {
            Edge edge = edges[i];
            if (differentSets(edge.getV(), edge.getW())) {
                tree.add(edge);
                union(edge.getV(), edge.getW());
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
