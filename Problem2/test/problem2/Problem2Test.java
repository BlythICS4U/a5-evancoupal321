/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evan
 */
public class Problem2Test {
    
    /**
     * Test of addDigits method, of class Problem2.
     */
    @Test
    public void testAddDigits() {
        System.out.println("addDigits");
        int result1 = Problem2.addDigits(433532); //Adds digits once
        int result2 = Problem2.addDigits(481142);
        int result3 = Problem2.addDigits(256633);
        int result4 = Problem2.addDigits(418988);
        int result5 = Problem2.addDigits(944161);
        int result6 = Problem2.addDigits(925370);
        int result7 = Problem2.addDigits(789257);
        int result8 = Problem2.addDigits(724245);
        int result9 = Problem2.addDigits(401196);
        int result10 = Problem2.addDigits(586879);
        assertEquals(20, result1);
        assertEquals(20, result2);
        assertEquals(25, result3);
        assertEquals(38, result4);
        assertEquals(25, result5);
        assertEquals(26, result6);
        assertEquals(38, result7);
        assertEquals(24, result8);
        assertEquals(21, result9);
        assertEquals(43, result10);
    }

    /**
     * Test of reduceDivide method, of class Problem2.
     */
    @Test
    public void testReduceDivide() {
        System.out.println("reduceDivide");
        int result1 = Problem2.reduceDivide(433532); //Adds digits until the result is one digit
        int result2 = Problem2.reduceDivide(481142);
        int result3 = Problem2.reduceDivide(256633);
        int result4 = Problem2.reduceDivide(418988);
        int result5 = Problem2.reduceDivide(944161);
        int result6 = Problem2.reduceDivide(925370);
        int result7 = Problem2.reduceDivide(789257);
        int result8 = Problem2.reduceDivide(724245);
        int result9 = Problem2.reduceDivide(401196);
        int result10 = Problem2.reduceDivide(586879);
        assertEquals(2, result1);
        assertEquals(2, result2);
        assertEquals(7, result3);
        assertEquals(2, result4);
        assertEquals(7, result5);
        assertEquals(8, result6);
        assertEquals(2, result7);
        assertEquals(6, result8);
        assertEquals(3, result9);
        assertEquals(7, result10);
    }
    
}
