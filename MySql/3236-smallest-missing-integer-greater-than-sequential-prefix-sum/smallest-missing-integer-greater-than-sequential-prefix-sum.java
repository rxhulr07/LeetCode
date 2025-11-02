class Solution {
    public int missingInteger(int[] nums) {
        int sum =nums[0];
        for(int i =1 ;i<nums.length; i++){
            if(nums[i-1]+1 != nums[i]){
                break;
            }
                sum+= nums[i];
        }

        // Arrays.sort(nums);
       
        int i =0;
       while(i<nums.length){
        if(sum == nums[i]){
            sum++;
            i=0;

        }
        i++;

       }

        return sum;
    }
}