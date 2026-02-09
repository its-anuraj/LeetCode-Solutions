class Solution {
public:
    bool isVowel(char c){
            c=tolower(c);
            return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
        }
    string reverseVowels(string s) {
        string vowel="";
        
        for(int i=0;i<s.length();i++){
            if(isVowel(s[i])){
                vowel+=s[i];
            }
            
        }
       int k=vowel.length()-1;
        for(int i=0;i<s.length();i++){
        if(isVowel(s[i])){
            s[i]=vowel[k];
            k--;
        }
        }
        return s;
    }
};