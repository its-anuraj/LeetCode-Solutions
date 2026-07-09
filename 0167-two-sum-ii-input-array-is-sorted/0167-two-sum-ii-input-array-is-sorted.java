class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] arr = new int[2];
        int p1=0;
        int p2=n-1;

        while (p1<p2) {
            int sum=numbers[p1] + numbers[p2];
           
                if (sum == target) {
                    arr[0] = p1 + 1;
                    arr[1] = p2 + 1;
                    return arr;
                }
                else if(sum>target){
                    p2--;
                }
                else{
                    p1++;
                }
            
        }
        return arr;
    }
}