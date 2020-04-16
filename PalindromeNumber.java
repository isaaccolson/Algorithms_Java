package com.company;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);

        for (int i = 0, length = s.length(); i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
