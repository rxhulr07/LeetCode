class Solution {
    public static char[] reverse(char [] arr , int left , int right ){

               while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return arr;
    }


    public String reverseStr(String s, int k) {

        char arr[] = s.toCharArray();
        int n = s.length();

        for(int i=0; i<n ; i+=2*k)
        {
        int left = i;
        int right = Math.min(i+k-1, arr.length -1);

        reverse(arr , left , right);
       }   

     return new String(arr); 
     
    }
}