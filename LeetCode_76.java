class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() < t.length() || s.length() == 0){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        int left = 0, right = 0;
        int count = 0;
        int minLen = s.length() + 1;
        int minLenIndex = 0;
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if(map.get(s.charAt(right)) >= 0){
                    count ++;
                }
            }
            while(left <= right && count == t.length()){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    minLenIndex = left;
                }
                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if(map.get(s.charAt(left)) > 0){
                        count --;
                    }
                }
                left ++;
            }
            right ++; 
        }
        return minLen == s.length() + 1 ? "" : s.substring(minLenIndex, minLenIndex + minLen);          
    }
}
