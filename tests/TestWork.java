/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import graphs.Floyd;
import datastructures.LinkedList;
import datastructures.MinPriorityQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sorting.MergeSort;
import static org.junit.Assert.*;

/**
 *
 * @author MrKnyaz
 */
public class TestWork {

    public TestWork() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
    public void testSorting() {
        String[] s = {"AC", "AB", "D", "C"};
        MergeSort.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
    //@Test
    public void testLinkedList() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.reverseList();
        list.write();
    }
    
    //@Test
    public void testGraphWithMatrix() {
        long[][] graph = {{0,1,7,1000,1000},{1,0,1000,4,1},{7,1000,0,1,1000},{1000,4,1,0,1},{1000,1,1000,1,0}};
        long[][] paths = new long[5][5];
        Floyd.calculate(graph, paths);
        for (int i=0;i<graph.length;i++) {
            for (int j=0;j<graph.length;j++) {
                System.out.print(graph[i][j]+ " ");
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();
        for (int i=0;i<paths.length;i++) {
            for (int j=0;j<paths.length;j++) {
                System.out.print(paths[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    //@Test
    public void testPQ() {
        //Integer[] arr = {14,8,7,13,12,11,15,4,3,10,9,6,5,2,1,0};
        MinPriorityQueue<Integer> pq = new MinPriorityQueue(10);
        pq.add(new Integer(3)); 
        pq.add(new Integer(4)); 
        pq.add(new Integer(5)); 
        pq.add(new Integer(0)); 
        pq.add(new Integer(8)); 
        pq.add(new Integer(1)); 
        pq.add(new Integer(2)); 
        pq.add(new Integer(6)); 
        pq.add(new Integer(7)); 
        pq.add(new Integer(9)); 
        //pq.write();
        for (Integer item = pq.popMin(); item!=null; item = pq.popMin()) {
            System.out.println(item);
        }
    }
}
