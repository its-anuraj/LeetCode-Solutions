class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size();
        int l=0;
        int r=n-1;
        vector<int> result(n);
        int k =n-1;
        while(l<=r){
        
            int leftsqu=nums[l]*nums[l];
            int rightsqu=nums[r]*nums[r];        
            
            if(leftsqu>rightsqu){
                result[k--]=leftsqu;
                l++;
            }
            else{
                result[k--]=rightsqu;
                r--;
            }

        }
         return result;
    }
};