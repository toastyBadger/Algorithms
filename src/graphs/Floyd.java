/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author MrKnyaz
 */
public class Floyd {

    public static void calculate(long[][] graph, long[][] paths) {
        int size = graph.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                paths[i][j] = i;
            }
        }
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (graph[i][j] > (graph[i][k] + graph[k][j])) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                        paths[i][j] = k;
                    }
                }
            }
        }

    }
}
