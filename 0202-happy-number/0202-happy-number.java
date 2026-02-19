class Solution {
    public boolean isHappy(int n) {
    int slow=n;
    int fast=n;
    do{
        slow=ss(slow);
        fast=ss(ss(fast));

    }while(slow!=fast);
    return slow==1;
    }

   int ss(int num){
      int  sum=0;
        while(num>0){
           int digit=num%10;
            sum+=digit*digit;
            num=num/10;
        }
        return sum;

    }
}