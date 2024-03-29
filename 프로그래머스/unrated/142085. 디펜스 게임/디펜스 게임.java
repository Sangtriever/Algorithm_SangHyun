import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < enemy.length; i++) {
            pq.add(enemy[i]);
            if(k < pq.size()){
                n -= pq.poll();
            }
            if(n < 0){
                return i;
            }
        }
        return enemy.length;
    }
}