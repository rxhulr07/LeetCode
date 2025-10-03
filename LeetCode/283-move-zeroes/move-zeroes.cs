public class Solution {
    public void MoveZeroes(int[] nums) {
        
        LinkedList<int> dq = new LinkedList<int>();
        
        for(int i =0; i<nums.Length; i++){
            if(nums[i]!=0) dq.AddLast(nums[i]);
        }

        for(int i =0; i<nums.Length; i++){
            if(nums[i]==0) dq.AddLast(nums[i]);
        }
      
      int index =0;
       while(dq.Count> 0){
        nums[index++]= dq.First.Value;
        dq.RemoveFirst();
       }


    }
}