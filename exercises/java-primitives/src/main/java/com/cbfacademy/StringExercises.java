package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        // throw new RuntimeException("Not implemented");
        // char[] letters = {'C','o','d','i','n','g'};
        return new String(characters);
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}
        long count = 0;
        text = text.toLowerCase();
        character = Character.toLowerCase(character);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
            // String output = "The number of "+character+" is "+count;

        }

        
        

        return count;

        // throw new RuntimeException("Not implemented");
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        /**for(int i =0; i < word.length(); i++){
            if()
        }**/
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "String Exercises";
    }

}
