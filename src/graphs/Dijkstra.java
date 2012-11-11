/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.LinkedList;

/**
 *
 * @author MrKnyaz
 */
public class Dijkstra {

    int V;
    int start;
    LinkedList<Edge>[] adj;
    double[] distTo;
    int[] edgeTo;
    boolean[] used;

    public Dijkstra(int vertices, LinkedList[] adjList, int startPoint) {
        V = vertices;
        start = startPoint;
        adj = adjList;
        distTo = new double[V];
        edgeTo = new int[V];
        used = new boolean[V];
        for (int i = 0; i < V; i++) {
            distTo[i] = 1000000000;
        }
        distTo[start] = 0;
        edgeTo[start] = start;
        int currentVertice = findMin();
        while (currentVertice != -1) {
            used[currentVertice] = true;
            updateDistance(currentVertice);
            currentVertice = findMin();
        }
    }

    private int findMin() {
        int minIndex = -1;
        double min = 1000000000;
        for (int i = 0; i < V; i++) {
            if (!used[i] && distTo[i] < min) {
                min = distTo[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void updateDistance(int v) {
        LinkedList<Edge> edges = adj[v];
        for (Edge edge : edges) {
            int to = edge.getOther(v);
            if (distTo[to] > (distTo[v] + edge.getWeight())) {
                distTo[to] = distTo[v] + edge.getWeight();
                edgeTo[to] = v;
            }
        }
    }
    
    public void write() {
        for (int i = 0; i < V; i++) {
            System.out.print(distTo[i]+" ");
        }
        for (int i = 0; i < V; i ++) {
            int midEdge = edgeTo[i];
            System.out.print(i+" ");
            while (midEdge != start) {
                System.out.print(midEdge+" ");
                midEdge = edgeTo[midEdge];
            }
            System.out.println(start);
        }
    }
}
