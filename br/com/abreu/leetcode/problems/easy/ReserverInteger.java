package br.com.abreu.leetcode.problems.easy;

public class ReserverInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = (r * 10) + x % 10;
            x = x / 10;
        }
        return (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE) ? 0 : (int) r;
    }
}
