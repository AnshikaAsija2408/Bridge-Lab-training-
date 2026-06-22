package Review4;

class Solution {
    public boolean isPalindrome(int x) {
        int n =x;
        int rev =0;
        int d;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        // int digit = x/10;
        // int n = n*10 + digit;
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
