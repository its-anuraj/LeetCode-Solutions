class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int n=nums.length;
        int[] ans=new int[2];
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;

            }
            else{
                i++;
            }
        }

        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }
        return ans;
        
    }
}