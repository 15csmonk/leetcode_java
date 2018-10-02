class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index0 = 0;
        int index1 = 0;
        for(int i = 0; i < numbers.length; i ++){
            for(int j = i + 1; j < numbers.length; j ++){
                if(numbers[j] == target - numbers[i]){
                    index0 = i + 1;
                    index1 = j + 1;
                }
            }
        }
        int ret[] = {index0, index1};
        return ret;
    }
}
