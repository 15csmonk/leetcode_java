class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, l = 0, r = 0;
        while(l < s.length() && r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r ++;
                res = Math.max(res, r - l);
            }
            else{
                set.remove(s.charAt(l));
                l ++;
            }
        }
        return res;
    }
}
