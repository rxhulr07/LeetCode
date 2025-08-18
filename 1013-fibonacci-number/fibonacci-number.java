class Solution {
    public int fib(int n) {
    int [] memo = new int[n+1];
      if(n==0) return 0;
      if(n==1) return 1;

      if(memo[n]!=0) return memo[n];

      memo[n] = fib(n-1) + fib(n-2);

      return memo[n];
     
    }
}