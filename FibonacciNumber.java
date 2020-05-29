class Solution {
    public int fib(int N) {
        return go(N,0,1);
    }
    public int go(int num, int current, int next) {
        if (num == 0) {
            return current;
        }else if(num == 1) {
            return next;
        }
        return go(num-1,next,current+next);
    }
}
//tail recursion 
