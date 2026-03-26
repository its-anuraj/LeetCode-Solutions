class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int currIndex=nums[i]-1;
                if(nums[i]==nums[currIndex]){
                    return nums[i];
                }

                int temp=nums[i];
                nums[i]=nums[currIndex];
                nums[currIndex]=temp;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}