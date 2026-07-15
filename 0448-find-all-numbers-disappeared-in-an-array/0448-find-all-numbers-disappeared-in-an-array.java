class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
           arr[nums[i]-1]=nums[i];
        }

        for(int i=0;i<n;i++){
            if(arr[i]==0)
            ans.add(i+1);
        }
        return ans;
    }
}