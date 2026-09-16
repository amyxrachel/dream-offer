class Solution {
    public int firstStableIndex(int[] nums, int k) {
        List<Integer> max = new ArrayList<Integer>();

        List<Integer> min = new ArrayList<Integer>();

        min = IntStream.of(nums).boxed().collect(Collectors.toList());
        int index = 0;
        while (index < nums.length) {
            max.add(min.get(0));
            int maxValue = max.stream().max(Integer::compareTo).orElse(0);
            int minValue = min.stream().min(Integer::compareTo).orElse(0);

            if (k >= maxValue - minValue) {
                return index;
            }

            min.remove(0);
            index++;

        }
        return -1;
    }
}