/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class Problem5Test {
    
    private static String[] words = null; //List of all words
    private static int[] indexes = null; //Indexes of the first wrods to start with each letter
    
    @BeforeClass
    public static void setUpClass()
    {
        words = new String[4]; //Create array of words
        words[0] = "bach";
        words[1] = "evan";
        words[2] = "joao";
        words[3] = "louie";
        indexes = new int[26]; //Set indexes of starting letters
        int indexNum = 0;
        while (indexNum < 2)
        {
            indexes[indexNum] = 0;
            indexNum++;
        }
        while (indexNum < 5)
        {
            indexes[indexNum] = 1;
            indexNum++;
        }
        while (indexNum < 10)
        {
            indexes[indexNum] = 2;
            indexNum++;
        }
        while (indexNum < 26)
        {
            indexes[indexNum] = 3;
            indexNum++;
        }
    }
    
    /**
     * Test of binarySearch method, of class Problem5.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        int result1 = Problem5.binarySearch(words, "bach", indexes); //Search for each oword
        int result2 = Problem5.binarySearch(words, "evan", indexes);
        int result3 = Problem5.binarySearch(words, "joao", indexes);
        int result4 = Problem5.binarySearch(words, "louie", indexes);
        int result5 = Problem5.binarySearch(words, "empty", indexes); //Search for a word not in the list
        assertEquals(0, result1);
        assertEquals(1, result2);
        assertEquals(2, result3);
        assertEquals(3, result4);
        assertEquals(-1, result5);
    }

    /**
     * Test of compareStrings method, of class Problem5.
     */
    @Test
    public void testCompareStrings() {
        System.out.println("compareStrings");
        int result1 = Problem5.compareStrings("brevard", "ulrich"); //Compare random words (taken from wordList)
        int result2 = Problem5.compareStrings("ulrich", "outbreaks");
        int result3 = Problem5.compareStrings("outbreaks", "transformers");
        int result4 = Problem5.compareStrings("transformers", "harnessing");
        int result5 = Problem5.compareStrings("harnessing", "shearing");
        int result6 = Problem5.compareStrings("shearing", "leticia");
        int result7 = Problem5.compareStrings("leticia", "qname");
        int result8 = Problem5.compareStrings("qname", "wxmap");
        int result9 = Problem5.compareStrings("wxmap", "bootup");
        int result10 = Problem5.compareStrings("bootup", "brevard");
        int result11 = Problem5.compareStrings("hundred", "hundred"); //Compare two identical words
        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(1, result3);
        assertEquals(2, result4);
        assertEquals(1, result5);
        assertEquals(2, result6);
        assertEquals(1, result7);
        assertEquals(1, result8);
        assertEquals(2, result9);
        assertEquals(1, result10);
        assertEquals(0, result11);
    }
    
}
