class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int new_nums[] = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                new_nums[temp] = nums[i];
                temp ++;
            }
        }
        for(int i = 0; i < new_nums.length; i ++){
            nums[i] = new_nums[i];
        }
        for(int i = new_nums.length; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}
