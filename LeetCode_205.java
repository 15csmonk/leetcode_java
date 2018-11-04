class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> s1 = new HashMap<Character, Character>();
        Map<Character, Character> t1 = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i ++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(s1.containsKey(cs)){
                char value = s1.get(cs);
                if(value != t.charAt(i)){
                    return false;
                }
            }else{
                s1.put(cs, t.charAt(i));
            }
            if(t1.containsKey(ct)){
                char value = t1.get(ct);
                if(value != s.charAt(i)){
                    return false;
                }
            }else{
                t1.put(ct, s.charAt(i));
            }
        }
        return true;
    }
}
