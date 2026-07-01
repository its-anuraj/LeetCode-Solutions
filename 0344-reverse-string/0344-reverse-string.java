class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
      char[] ans=new char[n];
        
        int index=0;

        for(int i=n-1;i>=0;i--){
            ans[index]=s[i];
            index++;
        }

        for(int i=0;i<n;i++){
            s[i]=ans[i];
        }
        
    }
}