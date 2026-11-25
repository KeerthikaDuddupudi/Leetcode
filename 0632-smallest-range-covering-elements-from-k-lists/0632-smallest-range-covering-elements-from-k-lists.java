
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int max = Integer.MIN_VALUE;

        // Add the first element of every list
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);

            pq.offer(new int[]{val, i, 0});

            max = Math.max(max, val);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (pq.size() == nums.size()) {

            int[] curr = pq.poll();

            int min = curr[0];
            int row = curr[1];
            int col = curr[2];

            // Update the smallest range
            if (max - min < end - start) {
                start = min;
                end = max;
            }

            // Move to the next element in the same list
            if (col + 1 < nums.get(row).size()) {

                int next = nums.get(row).get(col + 1);

                pq.offer(new int[]{next, row, col + 1});

                max = Math.max(max, next);

            } else {
                break;
            }
        }

        return new int[]{start, end};
    }
}
