import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = heights.length;
        int res = 0;
        for(int i = 1; i < n; i++){
            if(heights[i] <= heights[i - 1]){
                res = i;
                continue;
            }
            if(ladders != 0 ){
                pq.offer( heights[i] - heights[i - 1]);
                ladders--;
                res = i;
                continue;
            }

            if(ladders == 0){
                int step = heights[i] - heights[i - 1];
                if(!pq.isEmpty() && step > pq.peek()){
                    int replaceStep = pq.poll();
                    pq.offer(step);
                    bricks -= replaceStep;
                }else{
                    bricks -= step;
                }
                if(bricks < 0){
                    break;
                }
                res = i;
            }

        }
        return res;
    }
}
