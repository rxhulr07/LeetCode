class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        int i=0;
       int sign = 1;
      int n = s.length();
       long result =0;

       if(n<= 0 )return 0;

       if(s.charAt(i) == '-'){
        sign = -1;
        i++;
       }else if(s.charAt(i) == '+'){
        sign = 1;
        i++;
       }

       while(i<n && Character.isDigit(s.charAt(i))){
        result = result*10 +(s.charAt(i) - '0');

      if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
      if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        i++;


       }

       return (int)(result * sign);
    }
}