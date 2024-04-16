import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // Tc: O(n^2) Sc: O(k)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                pq.add(matrix[i][j]);
                if (pq.size() > k)
                    pq.poll();
            }
        }
        return pq.poll();
    }
}