class Solution {
    public boolean wordPattern(String pattern, String str) {
        String word[] = str.split(" ");
        if(word.length != pattern.length()){
            return false;
        }
        Map<Character, String> p = new HashMap<Character, String>();
        Map<String, Character> s = new HashMap<String, Character>();
        for(int i = 0; i < word.length; i ++){
            Character kp = pattern.charAt(i);
            if(p.containsKey(kp)){
                String value = p.get(kp);
                if(!value.equals(word[i])){
                    return false;
                }
            }else{
                p.put(kp, word[i]);
            }
            String ks = word[i];
            if(s.containsKey(ks)){
                char value = s.get(ks);
                if(value != pattern.charAt(i)){
                    return false;
                }
            }else{
                s.put(ks, pattern.charAt(i)); 
            }
        }
        return true;
    }
}
