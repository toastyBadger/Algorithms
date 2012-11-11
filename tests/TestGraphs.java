/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import graphs.Dijkstra;
import graphs.Edge;
import graphs.Floyd;
import graphs.Kruskal;
import graphs.Prim;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MrKnyaz
 */
public class TestGraphs {

    public TestGraphs() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //@Test

    public void testGraphWithMatrix() {
        long[][] graph = {{0, 1, 7, 1000, 1000}, {1, 0, 1000, 4, 1}, {7, 1000, 0, 1, 1000}, {1000, 4, 1, 0, 1}, {1000, 1, 1000, 1, 0}};
        long[][] paths = new long[5][5];
        Floyd.calculate(graph, paths);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < paths.length; i++) {
            for (int j = 0; j < paths.length; j++) {
                System.out.print(paths[i][j] + " ");
            }
            System.out.println();
        }
    }

    //@Test
    public void testPrim() {
        int V = 6;
        int E = 8;
        LinkedList<Edge>[] adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
        int[] from = {0, 0, 0, 5, 5, 2, 1, 0};
        int[] to = {1, 5, 2, 4, 2, 3, 3, 4};
        int[] weight = {2, 1, 3, 4, 7, 6, 5, 2};
        for (int i = 0; i < E; i++) {
            Edge edge = new Edge(from[i], to[i], weight[i]);
            adj[from[i]].add(edge);
            adj[to[i]].add(edge);
        }

        Prim prim = new Prim(V, E, adj);
        prim.calculateMST();
        prim.write();

    }

    //@Test
    public void testKruskal() {
        int V = 6;
        int E = 8;
        LinkedList<Edge>[] adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
        int[] from = {0, 0, 0, 5, 5, 2, 1, 0};
        int[] to = {1, 5, 2, 4, 2, 3, 3, 4};
        int[] weight = {2, 1, 3, 4, 7, 6, 5, 2};
        Edge[] edges = new Edge[E];
        for (int i = 0; i < E; i++) {
            edges[i] = new Edge(from[i], to[i], weight[i]);            
        }

        Kruskal kruskal = new Kruskal(V, edges);
        kruskal.write();
    }
    
    @Test
    public void testDijkstra() {
        int V = 7;
        int E = 9;
        LinkedList<Edge>[] adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
        int[] from = {0, 0, 0, 5, 2, 2, 3, 1, 4};
        int[] to = {2, 5, 3, 4, 1, 4, 1, 4, 6};
        int[] weight = {4, 1, 2, 3, 1, 3, 3, 5, 2};
        for (int i = 0; i < E; i++) {
            Edge edge = new Edge(from[i], to[i], weight[i]);
            adj[from[i]].add(edge);
            adj[to[i]].add(edge);
        }
        Dijkstra d = new Dijkstra(V, adj, 0);
        d.write();
    }
}
