/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Random;
/**
 *
 * @author Evan
 */
public class Problem4 {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) //Creates a list of 100 random integers
        {
            list[i] = rand.nextInt(10000);
        }
        swapSort(list); //Sorts the list in ascending order
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]); //Prints the numbers, in sorted order
        }
    }
    
    /**
     * RUNTIME COMPLEXITY IS: O((n^2+n)/2) = O(n^2)
     * Insertion sort is a better sorting method in any case.
     * Tests with reverse-sorted, sorted, and random arrays all showed insertion sort to be faster.
     * 
     * @param list The array before sorting
     * @return The array after sorting
     */
    public static int[] swapSort(int[] list)
    {
        int maxIndex;
        for (int i = list.length-1; i > 0; i--) //For every element from the last to the second...
        {
            maxIndex = 0; //0 is max of its own subset
            for (int j = 1; j <= i; j++) //For every element from 1 to i...
            {
                if (list[j] > list[maxIndex]) //Replace max index with j if the list at j is larger than the list at the max
                {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) //Swap the number at the max index with the number in the highest available position, unless it is already there
            {
                swap(list, maxIndex, i);
            }
        }
        return list; //Returns the list
    }
    
    /**
     * Swaps two numbers in an array
     * 
     * @param list The array of numbers
     * @param i The first index to swap from
     * @param j The second index to swap from
     * @return The list after the swap
     */
    public static int[] swap(int[] list, int i, int j)
    {
        int placeholder = list[i]; //Saves first value for later
        list[i] = list[j]; //Set first value equal to second value
        list[j] = placeholder; //Sets second value equal to original first value
        return list;
    }
    
}
