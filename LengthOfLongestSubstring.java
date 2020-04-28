package com.company;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length <= 1) {
            return length;
        }
        int longestLength = 0;
        String subString = "" + s.charAt(0);

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < subString.length(); j++) {
                if (s.charAt(i) == subString.charAt(j)) {
                    subString = subString.substring(j+1);
                    break;
                }
            }
            subString = subString + s.charAt(i);
            if (subString.length() > longestLength)
                longestLength = subString.length();
        }

        return longestLength;
    }
}
