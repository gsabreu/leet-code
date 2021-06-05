package br.com.abreu.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        Stack<Character> parenthesis = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if(parenthesesMap.containsKey(c)){
                parenthesis.push(parenthesesMap.get(c));
            }
            else if(parenthesesMap.containsValue(c)){
                if(parenthesis.isEmpty() || parenthesis.pop() != c){
                    return false;
                }
            }
        }
         return parenthesis.isEmpty();
    }


}
