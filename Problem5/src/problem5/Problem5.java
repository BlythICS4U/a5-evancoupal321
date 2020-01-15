/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Problem5 {

    static String[] words; //All of the words
    static int[] indexes; //Indexes of starting letters
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        readWords(); //Read in words
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to search for."); //User inputs a word to search
        String searchWord = scan.nextLine();
        int result = binarySearch(words, searchWord, indexes); //Search for the word in the list using binary search
        if (result == -1) //If the result was -1, something went wrong
        {
            System.out.println("The word was not found.");
        }
        else //Print the word and its location in the list (increased by 1 because arrays start at 0 instead of 1, so that the first word is #1 instead of #0
        {
            System.out.println(searchWord + " was word #" + (result+1) + " in the list.");
        }
    } 
    
    
    public static void readWords()
    {
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader("wordListWindows.txt")); //Object that reads files
            words = new String[100000]; //All of the words
            indexes = new int[26]; //The indexes of the first words to start with each letter
            indexes[0] = 0; //We know the first 'a' word starts with 0
            char indexLetter = 'a'; //Keeps track of the current starting letter
            String currentLine = br.readLine();
            words[0] = currentLine; //Read first word
            while (indexLetter <= words[0].charAt(0)) //Set index of all letters up to the strting letter of the first word to 0
            {
                indexes[indexLetter-'a'] = 0;
                indexLetter++;
            } //Reads the current line
            for (int i = 1; i < words.length; i++) //For every word in the list...
            {
                currentLine = br.readLine(); //Read the word
                words[i] = currentLine; //Set it equal to its spot in the array
                if (currentLine.charAt(0) != indexLetter) //If it is the first to start with a new letter, set that letter's index to the current index
                {
                    indexes[indexLetter-'a'+1] = i;
                    indexLetter+= currentLine.charAt(0) - indexLetter; //Increase the current index letter by the difference between it and the new letter (should be 1 unless an entire starting letter is missing)
                }             
            }
            if (indexLetter != 'z') //If there were no Z words in the list...
            {
                while (indexLetter <= 'z') //Fills indexes of any letters after the starting letter of the final word with the last array
                {
                    indexes[indexLetter - 'a'] = 99999;
                    indexLetter++;
                }
            }
        }
        catch (IOException ex) //Handle exception
        {
            ex.printStackTrace(System.out);
        }
        finally
        {
            try
            {
                if (br != null) //Close the reader
                {
                    br.close();
                }
            }
            catch (IOException ex) //Handle exception
            {
                System.out.println("Error in closing the BufferedReader");
                ex.printStackTrace(System.out);
            }
        }      
    }
    
    
    
    /**
     * Search for a word in the list
     * 
     * @param words List of words
     * @param word Word to search for
     * @param indexes The indexes of the first word to start with each letter
     * @return The index of the word in the list
     */
    public static int binarySearch(String[] words, String word, int[] indexes)
    {
        char firstChar = word.charAt(0); //The first character in the word
        int low, high; //The high and low indexes for binary search
        if (firstChar == 'z') { //If the word starts with z, the starting high will be the end of the array
            low = indexes[25];
            high = words.length - 1;
        } else { //Otherwise, it will be the starting index of the next letter
            low = indexes[firstChar - 'a'];
            high = indexes[firstChar - 'a' + 1];
        }
        int middle; //The middle of low and high, used to split the list
        while (low <= high)
        {
            middle = (low + high)/2;
            int compare = compareStrings(words[middle], word); //Compares the word at index middle with the word being searched
            switch(compare)
            {
                case 0: //If the words are the same, return the middle index
                    return middle;
                case 1: //If the word at middle comes first, move low up so that you are only searching above middle
                    low = middle+1;
                    break;
                case 2: //If the word at middle comes second, move high down so that you are only searching below middle
                    high = middle-1;
                    break;
                default: //Exception
                    System.out.println("Exception: String comparison invalid");
                    return -1;
            }
        }
        return -1;
    }
    
    /**
     * Compares two strings to see which comes first alphabetically
     * 
     * @param first The first string
     * @param second The second string
     * @return 0 if the strings are equal, 1 if the first string comes first, 2 if the second string comes first
     */
    public static int compareStrings(String first, String second)
    {
        if (first.equals(second)) //If the words are the same, return 0
        {
            return 0;
        }
        int length1 = first.length();
        int length2 = second.length();
        int i = 0;
        while (i < length1 && i < length2) //Compare the letters of the strings until one string runs out of letters
        {
            if (first.charAt(i) < second.charAt(i)) //If the first string comes first alphabetically, return 1
            {
                return 1;
            }
            if (first.charAt(i) > second.charAt(i)) //If the second string comes first alphabetically, return 2
            {
                return 2;
            }
            i++; //Increment the loop
        } //If you make it past the loop, one word is the same as the other word but with additional letter at the end of the word
        if (i == length1) //If the first word is finished (therefore the second word has the extra letters), return 1
        {
            return 1;
        }
        else if (i == length2) //If the second word is finished (therefore the first word has the extra letters), return 2
        {
            return 2;
        }
        else //This statement should never be reached, but it is included for exception handling purposes
        {
            return -1;
        }
    }
    
}
