class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;

        List<Boolean> arr=new ArrayList<>();

        int max=Arrays.stream(candies).max().getAsInt();

        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}