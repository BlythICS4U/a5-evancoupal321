/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;
import java.util.Random;
/**
 *
 * @author Evan
 */
public class Problem3 {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        Person[] list = new Person[100];
        for (int i = 0; i < 100; i++) //Creates a list of 100 students with random IDs
        {
            list[i] = new Person(Integer.toString(rand.nextInt(10000)), "Student", 16);
        }
        insertionSort(list); //Sorts the list
        for (int i = 0; i < 100; i++)
        {
            System.out.println(list[i].getId()); //Prints the students' IDs, in sorted order
        }
    }
    
    /**
     * Sorts an array of Person objects
     * 
     * @param list The list of Person objects
     * @return the list after sorting
     */
    public static Person[] insertionSort(Person[] list)
    {
        int length = list.length;
        for (int i = 1; i < length; i++) //For every element except the first...
        {
            for (int j = i; j > 0; j--) //For every element from i down to 0
            {
                if (list[j].compareTo(list[j-1]) < 0) //If the element at i is smaller than the previous, swap
                {
                    swap(list, j, j-1);
                }
                else //The subset from 0 to i is sorted, break from j loop
                {
                    break;
                }
            }
        }
        return list;
    }
    
    /**
     * Swaps two Person objects in an array
     * 
     * @param list The array of Person objects
     * @param i The first index to swap from
     * @param j The second index to swap from
     * @return The list after the swap
     */
    public static Person[] swap(Person[] list, int i, int j)
    {
        Person placeholder = list[i]; //Saves first value for later
        list[i] = list[j]; //Set first value equal to second value
        list[j] = placeholder; //Sets second value equal to original first value
        return list;
    }
    
}
