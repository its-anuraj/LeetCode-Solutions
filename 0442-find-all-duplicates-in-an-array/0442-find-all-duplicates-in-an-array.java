class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currIndex = nums[i] - 1;
            if (nums[i] != nums[currIndex]) {
                swap(nums, i, currIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }

        }
        return ans;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}