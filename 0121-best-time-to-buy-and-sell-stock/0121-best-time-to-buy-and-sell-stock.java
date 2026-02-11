class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int maxdiff=0;
        for(int i=1;i<n;i++){
            if(prices[i]>min){
                int diff=prices[i]-min;
                maxdiff=Math.max(diff,maxdiff);
            }else{
                min=prices[i];
            }
        }
        return maxdiff;
    }
}