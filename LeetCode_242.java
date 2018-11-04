class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> t1 = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            if(s1.containsKey(c)){
                s1.put(c, s1.get(c) + 1);
            }else{
                s1.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(t1.containsKey(c)){
                t1.put(c, t1.get(c) + 1);
            }else{
                t1.put(c, 1);
            }
        }
        for(int i = 0; i < s.length(); i ++){
            if(!s1.get(s.charAt(i)).equals(t1.get(s.charAt(i)))){
                return false;
            }  
        }
        return true;
    }
}
