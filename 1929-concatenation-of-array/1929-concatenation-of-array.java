class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int p1=0;
        int p2=0;

        for(int i=0;i<n;i++){
            ans[i]=nums[p1];
            ans[i+n]=nums[p2];
            p1++;
            p2++;
        }

       

        return ans;

    }
}