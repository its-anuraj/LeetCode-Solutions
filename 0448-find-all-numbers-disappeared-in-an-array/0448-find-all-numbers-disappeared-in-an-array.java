class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> ans= new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}