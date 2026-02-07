class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        int count1=0,count2=0,count3=0;
        int i=0;

        while(i<n){
            if(nums[i]==0){
                count1++;
                 i++;
                
            }else if(nums[i]==1){
                count2++;
                 i++;
            }else{
                count3++;
                 i++;
            }
        }
        for(int i=0;i<n;i++){

            if(count1>0){
                nums[i]=0;
                count1--;
            }
            else if(count2>0){
                nums[i]=1;
                count2--;
            }
            else{
                nums[i]=2;
                count3--;
            }
        }
        
    }
};