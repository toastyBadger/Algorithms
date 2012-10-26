/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import datastructures.LinkedList;
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
    
    @Test
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
}
