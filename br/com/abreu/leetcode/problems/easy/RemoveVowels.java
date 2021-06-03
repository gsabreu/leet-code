package br.com.abreu.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 */

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
    }

    public static String removeVowels(String s) {
        HashSet<Character> vowels = setupHashSet();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(!vowels.contains(curr)){
                result.append(curr);
            }
        }

        return result.toString();
    }

    public static HashSet<Character> setupHashSet(){
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        return vowels;
    }
}
