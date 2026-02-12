class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int n=candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
    
        for(int i=0;i<n;i++)
        {
            candies[i]=candies[i]+extraCandies;
        }

        for(int i=0;i<n;i++){
            if(candies[i]>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}