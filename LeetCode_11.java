class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxFill = 0;
        while(l != r){
            int curHeight = Math.min(height[l], height[r]);
            int curFill = curHeight * (r - l);
            maxFill = Math.max(curFill, maxFill);
            if(height[l] > height[r])
                r --;
            else l ++;
        }
        return maxFill;
    }
}
