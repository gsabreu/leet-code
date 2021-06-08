package br.com.abreu.leetcode.challenge;

import java.util.Locale;

public class GroupByTest {
    public static void main(String[] args) {
        String sentence = "XYZ Skin Tanning Lotion. Aloe Vera and Chamomile for smooth and soft skin. Free of Oxybenzone, Parabens, Phthalates, Fragrance, Animal Derived Ingredients and never tested on animals. This product does not contain a sunscreen and does not protect against sunburn. Repeated exposure of unprotected skin while tanning may increase the risk of skin aging, skin cancer and other harmful effects to the skin, even if you do not burn.";
        System.out.println(countTheWordFrequency(sentence, "skin"));
    }

    //without case sensetive
    public static int countTheWordFrequency(String sentence, String word){
        int count =0;
        sentence = sentence.replaceAll(",", "");
        sentence = sentence.replaceAll("[.]", "");
        String[] sliptedWord = sentence.split(" ");

        // word by word
        for (int i = 0; i < sliptedWord.length; i++) {
            if (sliptedWord[i].equalsIgnoreCase(word)) {
                count += 1;
            }
        }
       return count;
    }

}
