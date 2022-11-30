package com.bridgelabz.hashtable;

public class Hashtable {

    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // Converting the para words to lower case and removing spaces.
        String[] sentenceArray = sentence.toLowerCase().split(" ");

        // Iterating over the array.
        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if (value == null) // //frequency of the word StayWith 1
                value = 1;
            else
                value = value + 1; // frequency of the word increases by 1
            hashTable.add(word, value);
            System.out.println("Value = " + value);
        }
        System.out.println(hashTable);
        // Remove "avoidable" from the hashtable
        hashTable.remove("avoidable");
        System.out.println(hashTable);
    }
}