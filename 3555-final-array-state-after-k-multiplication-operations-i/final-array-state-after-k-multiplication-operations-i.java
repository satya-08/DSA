class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> {
            if (x[0] != y[0])
                return Integer.compare(x[0], y[0]);
            return Integer.compare(x[1], y[1]);
        });
        for (int i = 0; i < nums.length; i++)
            pq.add(new int[] { nums[i], i });
        while (k-- > 0) {
            int[] smallest = pq.poll();
            int index = smallest[1];
            nums[index] *= multiplier;
            pq.offer(new int[] { nums[index], index });
        }
        return nums;

    }
}