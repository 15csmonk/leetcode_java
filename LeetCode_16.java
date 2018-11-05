class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int minGap = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                int gap = Math.abs(sum - target);
                if(gap < minGap){
                    res = sum;
                    minGap = gap;
                }
                if(sum < target){
                    j ++;
                }else{
                    k --;
                }
            }
        }
        return res;
    }
}
