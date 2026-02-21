class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1 && nums[0] != target)
            return -1;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (nums[i] == target) {
                return i;

            }

            else if (nums[j] == target) {
                return j;

            }
            i++;
            j--;
        }
        return -1;
    }
}