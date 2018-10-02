class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int index1 = 0;
        for(int i = 0; i < nums.length; i ++){
           for(int j = i+1; j < nums.length; j ++){
               if(nums[j] == target - nums[i]){
                   index = i;
                   index1 = j;
               }
           }
        }
        int ret[] = {index, index1};
        return ret;
    }
}
