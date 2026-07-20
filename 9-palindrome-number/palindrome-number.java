class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int dup=n;
        int res=0;
        while(n>0){
            res=(n%10)+(res*10);
            n=n/10;
        }
        return res==dup;
    }
}