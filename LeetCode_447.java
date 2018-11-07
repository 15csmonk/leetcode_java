class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length < 3){
            return 0;
        }    
        int res = 0;
        for(int i = 0; i < points.length; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                int dis = (int)(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
                if(map.containsKey(dis)){
                    map.put(dis, map.get(dis) + 1);
                }else{
                    map.put(dis, 1);
                }
            }
            for(Integer value: map.values()){
                res += value * (value - 1);
            }
        }        
        return res;
    }
}
