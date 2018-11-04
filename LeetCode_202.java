class Solution {
    public boolean isHappy(int n) {
        if(n == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int res = 0;
            while(n > 0){
                k = n % 10;
                n /= 10;
                res += Math.pow(k, 2);
            }
            n = res;
        }
        return n == 1;
    }
}
