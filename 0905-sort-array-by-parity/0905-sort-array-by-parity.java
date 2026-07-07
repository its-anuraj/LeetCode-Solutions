class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        
        int end = n - 1;

        for (int i = 0; i <=end; i++) {
            if (nums[i] % 2 != 0) {
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
                i--;
            }
           
        
        }

        return nums;

    }
}