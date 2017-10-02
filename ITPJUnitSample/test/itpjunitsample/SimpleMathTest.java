/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itpjunitsample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT16029514
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class SimpleMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = SimpleMath.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class SimpleMath.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = SimpleMath.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class SimpleMath.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = SimpleMath.subtract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scalarMultiplication method, of class SimpleMath.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        int[] a = null;
        int[] b = null;
        int expResult = 0;
        int result = SimpleMath.scalarMultiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equal method, of class SimpleMath.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = SimpleMath.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
