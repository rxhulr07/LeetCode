class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
       

        for(int i=0; i<nums.length; i++){
            int key = nums[i];
              mp.put(key, mp.getOrDefault(key,0)+1);
        }

        int []result = new int[k];

         for(int i=0; i<k; i++){
         int maxKey = -1;
         int maxfreq = -1;

         for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue()> maxfreq){
                maxfreq = entry.getValue();
                maxKey = entry.getKey();
            }
         }
         result[i] = maxKey;
         mp.remove(maxKey);
         }
          return result;
        }
        
    }
