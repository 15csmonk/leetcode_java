/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

//判断三点是否共线可以用公式：x1 * y2 + x2 * y3 + x3 * y1 - x3 * y2 - x2 * y1 -x1 * y3 == 0，如果等于0，则说明三点共线

class Solution {
    public int maxPoints(Point[] points) {
        int res = 0;
        int n = points.length;
        for(int i = 0; i < n; i ++){
            int duplicate = 1;
            for(int j = i + 1; j < n; j ++){
                int count = 0;
                long x1 = points[i].x, y1 = points[i].y;
                long x2 = points[j].x, y2 = points[j].y;
                if(x1 == x2 && y1 == y2){
                    duplicate ++;
                    continue;
                }
                for(int k = 0; k < n; k ++){
                    long x3 = points[k].x, y3 = points[k].y;
                    if(x1 * y2 + x2 * y3 + x3 * y1 - x3 * y2 - x2 * y1 -x1 * y3 == 0){
                        count ++;
                    }
                }
                res = Math.max(res, count);
            }
            res = Math.max(res, duplicate);
        }
        return res;
    }
}
