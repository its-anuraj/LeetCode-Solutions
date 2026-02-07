class Solution {
public:
    int minimumDeletions(string s) {
        int count=0;
        int deletions=0;

        for(char c: s){
            if(c=='b'){
                count++;

            }else{
                deletions=min(deletions+1,count);
            }
        }
        return deletions;
    }
};