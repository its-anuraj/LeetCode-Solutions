class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int currIndex=nums[i]-1;
            if(nums[i]!=nums[currIndex]){
                swap(nums,i,currIndex);
            }
            else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
    void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}