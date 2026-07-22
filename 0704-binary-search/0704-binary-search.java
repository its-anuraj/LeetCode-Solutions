class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int first = 0;
        int last = n - 1;
        boolean isAsc = nums[first] < nums[last];

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (target == nums[mid])
                return mid;

            if (isAsc) {
                if (target > nums[mid]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

        }
        return -1;
    }
}