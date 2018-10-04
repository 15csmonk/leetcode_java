class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int r = -1;
        int minSum = nums.length + 1;
        int sum = 0;
        while(r < nums.length){
            if(sum < s){
                r ++;
                if(r == nums.length)
                    break;
                sum += nums[r];
            }
            else if(sum >= s){
                sum -= nums[l];
                l ++;
            }
            if(sum >= s){
                int curSum = r - l + 1;
                minSum = Math.min(minSum, curSum);
            }
        }
        return minSum == nums.length + 1 ? 0 : minSum;  
    }
}
