class Solution {
    public int reverse(int x) {
        //loop through the int mod by 10 / 10 then reverse * 10 and the int
        long reversed = 0;

        while(x!=0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        //Integer overflow checks
         if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversed;
    }
}
