class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        int l = 0;
        int r = 1;
        int count = 1;
        while(r < nums.length){
            if(nums[l] == nums[r] && count == 0)
                r ++;
            else{
                if(nums[l] == nums[r])
                    count --;
                else count = 1;
                l ++;
                nums[l] = nums[r];
                r ++;
            }
        }
        return l+1;
    }
}
