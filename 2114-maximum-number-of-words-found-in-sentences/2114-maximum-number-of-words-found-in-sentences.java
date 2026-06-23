class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        
        for(int i=0;i<n;i++){
            String[] words=sentences[i].split(" ");
            if(words.length>max){
                max=words.length;
            }
        }
        return max;
    }
}