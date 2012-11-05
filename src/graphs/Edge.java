/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Knyazev Alexander <aknyazev@kkb.kz>
 */
public class Edge implements Comparable<Edge> {

    private int v;
    private int w;
    private double weight;

    public Edge(int first, int second, double weight) {
        v = first;
        w = second;
        this.weight = weight;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    public int getOther(int vertice) {
        if (vertice == w) {
            return v; 
        } else if (vertice == v) {
            return w; 
        } else {
            return -1;
        }
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Edge edge) {
        if (this.weight < edge.getWeight()) {
            return -1;
        } else if (this.weight > edge.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
