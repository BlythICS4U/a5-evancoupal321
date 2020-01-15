/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evan
 */
public class Problem4Test {
    
    private static int[] numbers;
    
    @Before
    public void setUp()
    {
        numbers = new int[10]; //Create an array of integers
        numbers[0] = 88;
        numbers[1] = 32;
        numbers[2] = 91;
        numbers[3] = 13;
        numbers[4] = 35;
        numbers[5] = 100;
        numbers[6] = 1;
        numbers[7] = 24;
        numbers[8] = 12;
        numbers[9] = 73;
    }

    /**
     * Test of swapSort method, of class Problem4.
     */
    @Test
    public void testSwapSort() {
        System.out.println("swapSort");
        int[] expResult = new int[10];
        expResult[0] = numbers[6]; //Manually place the numbers in the correct location in expResult
        expResult[1] = numbers[8];
        expResult[2] = numbers[3];
        expResult[3] = numbers[7];
        expResult[4] = numbers[1];
        expResult[5] = numbers[4];
        expResult[6] = numbers[9];
        expResult[7] = numbers[0];
        expResult[8] = numbers[2];
        expResult[9] = numbers[5];
        int[] result = Problem4.swapSort(numbers); //Sort the list in result
        for (int i = 0; i < 9; i++)
        {
            assertTrue(result[i] < result[i+1]); //Checks if each number is larger than the previous one
        }
        assertArrayEquals(expResult, result); //Checks if the result matches the manual placing
    }

    /**
     * Test of swap method, of class Problem4.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");  
        Random rand = new Random();
        for (int x = 0; x < 100; x++)  //Repeat the following 100 times:
        {      
            int i = rand.nextInt(10);
            int j = rand.nextInt(10);
            int iBefore = numbers[i];
            int jBefore = numbers[j];
            numbers = Problem4.swap(numbers, i, j); //Swaps two random items (at indexes i and j)
            assertEquals(iBefore, numbers[j]); //Checks if the new i is equal to the old j and vice versa
            assertEquals(jBefore, numbers[i]);
        }
    }
    
}
