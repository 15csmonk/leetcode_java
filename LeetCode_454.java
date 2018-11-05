class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < B.length; j ++){
                if(map.containsKey(A[i] + B[j])){
                    map.put(A[i] + B[j], map.get(A[i] + B[j]) + 1);
                }else{
                    map.put(A[i] + B[j], 1);
                }
            }
        }
        for(int i = 0; i < C.length; i ++){
            for(int j = 0; j < D.length; j ++){
                int keyCD = -1 * (C[i] + D[j]);
                if(map.containsKey(keyCD)){
                    res += map.get(keyCD);
                }
            }
        }
        return res;
    }
}
