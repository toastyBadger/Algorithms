/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import srm558.SurroundingGameEasy;
import static org.junit.Assert.*;

/**
 *
 * @author MrKnyaz
 */
public class TestTopCoder {

    public TestTopCoder() {
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
    // public void hello() {}

    @Test
    public void testSurroundingGame() {
        String[] cost = {"4362", "4321"};
        String[] benefit = {"5329", "5489"};
        String[] stone = {"...o", "..o."};
        System.out.println(SurroundingGameEasy.score(cost, benefit, stone));
    }
}
