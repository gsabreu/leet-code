package br.com.abreu.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
    System.out.println(reverseVowels("aA"));

    }

    //13ms
    public static String reverseVowels(String s) {
        HashSet<Character> vowels = setupHashSet();
        char[] chars = s.toCharArray();
        List<Character> reversedVowelsFromString = new ArrayList<>();
        for (int i = chars.length -1; i >= 0; i--) {
            if (vowels.contains(chars[i])){
                reversedVowelsFromString.add(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        int auxReversed = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))){
                result.append(reversedVowelsFromString.get(auxReversed));
                auxReversed++;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    //3ms
    public String FasterReverseVowels(String s)
    {
        int i = 0 , j = s.length() - 1 ;
        char temp ;
        HashSet<Character> vowels= setupHashSet();
        char[] c = s.toCharArray() ;
        while( i < j )
        {
            while( i < j && !vowels.contains(c[i]))
            {
                i++;
            }
            while( i < j && !vowels.contains(c[j]))
            {
                j--;
            }
            temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
        return new String(c) ;
    }
    public static HashSet<Character> setupHashSet(){
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        return vowels;
    }


}
