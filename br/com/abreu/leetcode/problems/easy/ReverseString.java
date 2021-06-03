package br.com.abreu.leetcode.problems.easy;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int i = s.length -1;
        int j = 0;

        while(i >= j) {
            char aux = s[j];
            s[j] = s[i];
            s[i] = aux;
            i--;
            j++;
        }
        System.out.println(s);
    }
}
