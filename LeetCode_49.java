/*
1.先将strs转为数组，并进行排序
2.再用Map<String, List<String>>判断key值是否在map中
3.最后遍历map中的value值
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs.length < 1){
            return list;
        }
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i ++){
            String temp = strs[i];
            char c[] = temp.toCharArray();
            Arrays.sort(c);
            temp = new String(c);
            if(map.containsKey(temp)){
                map.get(temp).add(strs[i]);
            }else{
                List<String> item = new ArrayList<>();
                item.add(strs[i]);
                map.put(temp, item);
            }
        }
        for(List<String> value : map.values()){         	  
            list.add(value);           
        }
        return list;
    }
}
