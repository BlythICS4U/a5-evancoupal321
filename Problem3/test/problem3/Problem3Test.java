/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import org.junit.Before;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

/**
 *
 * @author Evan
 */
public class Problem3Test {
    
    private static Person[] personList;
    
    @Before
    public void setUp()
    {
        personList = new Person[10]; //Create an array of Person objects
        personList[0] = new Person("56", "person1", 16);
        personList[1] = new Person("76", "person2", 16);
        personList[2] = new Person("42", "person3", 16);
        personList[3] = new Person("12", "person4", 16);
        personList[4] = new Person("46", "person5", 16);
        personList[5] = new Person("60", "person6", 16);
        personList[6] = new Person("72", "person7", 16);
        personList[7] = new Person("38", "person8", 16);
        personList[8] = new Person("87", "person9", 16);
        personList[9] = new Person("82", "person10", 16);
    }

    /**
     * Test of insertionSort method, of class Problem3.
     */
    @Test
    public void testInsertionSort()
    {
        System.out.println("insertionSort");
        Person[] expResult = new Person[10];
        expResult[0] = personList[3]; //Manually place the Persons in the correct location in expResult
        expResult[1] = personList[7];
        expResult[2] = personList[2];
        expResult[3] = personList[4];
        expResult[4] = personList[0];
        expResult[5] = personList[5];
        expResult[6] = personList[6];
        expResult[7] = personList[1];
        expResult[8] = personList[9];
        expResult[9] = personList[8];
        Person[] result = Problem3.insertionSort(personList); //Sort the list in result
        for (int i = 0; i < 9; i++)
        {
            assertTrue(Integer.parseInt(result[i].getId()) < Integer.parseInt(result[i+1].getId())); //Checks if each ID is larger than the previous one
        }
        assertArrayEquals(expResult, result); //Checks if the result matches the manual placing
    }

    /**
     * Test of swap method, of class Problem3.
     */
    @Test
    public void testSwap()
    {
        System.out.println("swap");  
        Random rand = new Random();
        for (int x = 0; x < 100; x++) //Repeat the following 100 times:
        {      
            int i = rand.nextInt(10);
            int j = rand.nextInt(10);
            Person iBefore = personList[i];
            Person jBefore = personList[j];
            personList = Problem3.swap(personList, i, j); //Swaps two random items (at indexes i and j)
            assertEquals(iBefore, personList[j]); //Checks if the new i is equal to the old j and vice versa
            assertEquals(jBefore, personList[i]);
        }
    }
    
    public void testCompareTo()
    {
        
    }
    
}
