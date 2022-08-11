package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a word and the program will count the characters: ");
        String myString = input.nextLine();
        String myStr = myString.toLowerCase();
        /*String myStr = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of " +
                "the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";*/
        //String myStr ="apple";

        HashMap<Character, Integer> myDataStructure = new HashMap<>();

        //System.out.println(charactersInString);
        char[] charactersInString = myStr.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            if ( Character.isLetter(charactersInString[i]) ) {
                if ( myDataStructure.containsKey(charactersInString[i]) ) {
                    myDataStructure.put(charactersInString[i], myDataStructure.get(charactersInString[i]) + 1);
                } else {
                    myDataStructure.put(charactersInString[i], 1);
                }
            }

            }
        for (Map.Entry<Character, Integer> data : myDataStructure.entrySet()) {
            System.out.println(data.getKey() + ":" + data.getValue());
        }
    }
}


