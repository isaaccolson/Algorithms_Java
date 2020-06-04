class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2;i++) {
            char charHolder = s[i];
            s[i] = s[s.length-(1+i)];
            s[s.length-(1+i)] = charHolder;
        }
    }
    public String reverseString(String s) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length()/2;i++) {
            charArray[i] = s.charAt(s.length()-(1+i));
            charArray[s.length()-(1+i)] = charArray[i];
        }
        return Arrays.toString(charArray);
    }
}
