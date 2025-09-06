class Solution {
    public boolean isAnagram(String s, String t) {
     
     HashMap<Character, Integer> map = new HashMap<>();

     if(s.length()!= t.length()) return false;

     for(int i =0; i<s.length(); i++){
        char c = s.charAt(i);
        map.put(c, map.getOrDefault(c, 0)+1);
     }

     for( char c : t.toCharArray()){
        Integer count = map.get(c);
       if ( count == null || count == 0) return false;
        map.put(c, count -1);
     }

     for( int value : map.values()){
        if(value != 0) return false;
     }

     return true;




        
       
    }
}