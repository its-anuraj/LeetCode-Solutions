class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxarea=0;
        int l=0;
        int r=n-1;
        while(l<r){
            int width=r-l;
            int minheight=Math.min(height[l],height[r]);
            int area=width*minheight;

            maxarea=Math.max(maxarea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}