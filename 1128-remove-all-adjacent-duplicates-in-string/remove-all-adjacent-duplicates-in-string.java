class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);

    if (!st.isEmpty() && st.peek() == c) {
        st.pop();  
        continue;     
    }

    st.push(c);    
}

   StringBuilder result = new StringBuilder();

     while(!st.isEmpty()){
        result.append(st.pop());
     }

    return result.reverse().toString();

    }
}