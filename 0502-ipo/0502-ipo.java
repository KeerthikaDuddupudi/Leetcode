

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        // Min heap based on required capital
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Max heap based on profit
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        // Store capital and profit of each project
        for (int i = 0; i < profits.length; i++) {
            minHeap.offer(new int[]{capital[i], profits[i]});
        }

        // Select at most k projects
        for (int i = 0; i < k; i++) {

            // Add all affordable projects to max heap
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= w) {
                maxHeap.offer(minHeap.poll()[1]);
            }

            // No project can be started
            if (maxHeap.isEmpty()) {
                break;
            }

            // Select the project with maximum profit
            w += maxHeap.poll();
        }

        return w;
    }
}
