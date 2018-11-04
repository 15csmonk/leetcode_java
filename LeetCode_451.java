class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> s1 = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            if(s1.containsKey(c)){
                s1.put(c, s1.get(c) + 1);
            }else{
                s1.put(c, 1);
            }
        }
        List<Character>[] bucket = new ArrayList[s.length()+1];    
        for (char k : s1.keySet()) {
            int v = s1.get(k);
            if(bucket[v]==null){
                bucket[v] = new ArrayList<>();
            } 
            bucket[v].add(k);
        }
        StringBuilder s2 = new StringBuilder();
        for(int i = bucket.length - 1; i > 0; i --) {
            if(bucket[i] != null) {
                for(char c : bucket[i]) {
                    for(int j = 0; j < s1.get(c); j ++) {
                        s2.append(c);
                    }
                }
            }
        }
        return s2.toString();
    }
}
