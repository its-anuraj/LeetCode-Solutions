class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int[] arr=new int[n];

        if(n==1) return nums;

        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
               arr[right]=nums[i];
               right--;
               
            }
            else{
                arr[left]=nums[i];
                left++;
            }

        }
        return arr;
        
    }
}