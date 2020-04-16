package com.company;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String sX = Integer.toString(x);

        for (int i = 0, length = sX.length(); i < length / 2; i++) {
            if (sX.charAt(i) != sX.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}
