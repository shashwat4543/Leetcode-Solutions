class Solution {
    private int fibonacciNUM(int n){
        if(n<=1) return n;
        return fibonacciNUM(n-1)+fibonacciNUM(n-2);
    }
    public int fib(int n) {
        int ans = fibonacciNUM(n);
        return ans;
    }
}