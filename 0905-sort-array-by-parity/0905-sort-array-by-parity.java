class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int index=0;
        int[] arr=new int[n];

        if(n==1) return nums;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
               arr[index++]=nums[i];
               
            }
           
        }

        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[index++]=nums[i];
            }
        }
        return arr;
        
    }
}