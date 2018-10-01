class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3];
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0)
                count[nums[i]] ++;
            else if(nums[i] == 1)
                count[nums[i]] ++;
            else count[nums[i]] ++;
        }
        for(int i = 0; i < count[0]; i ++)
            nums[i] = 0;
        for(int i = count[0]; i < (count[0] + count[1]); i ++)
            nums[i] = 1;
        for(int i = (count[0] + count[1]); i < nums.length; i ++)
            nums[i] = 2;
        for(int i = 0; i < nums.length; i ++){
            System.out.print(nums[i]);
        } 
    }
}
