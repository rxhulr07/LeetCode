public class Solution {
    public int FirstUniqChar(string s) {

        Dictionary<char,int> mp = new Dictionary<char,int>();

        for(int i=0; i<s.Length; i++){
            char ch = s[i];
            if(mp.ContainsKey(ch)){
                mp[ch]++;
            }else{

            mp[ch] = 1;
            }

        }

        for(int i =0; i<s.Length; i++){
            if(mp[s[i]]== 1){
                return i;
            }
        }
        return -1;

        }
        
    
}