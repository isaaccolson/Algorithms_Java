class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seenValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (seenValues.containsKey(difference)){
                return new int[] {i,seenValues.get(difference)};
            }
            seenValues.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
