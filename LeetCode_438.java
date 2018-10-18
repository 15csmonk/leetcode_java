class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        int p1[] = new int[26];
        int s1[] = new int[26]; 
        int k = 0;
        
        for(int i = 0; i < p.length(); i ++)
            p1[p.charAt(i) - 'a'] ++;
        
        for(int i = 0; i < s.length(); i ++){
            s1[s.charAt(i) - 'a'] ++;
            while(i - k >= p.length()){
                s1[s.charAt(k) - 'a'] --;
                k ++;
            }
            if(Arrays.equals(s1, p1))
                res.add(k);
        }
        return res;
    }
}
