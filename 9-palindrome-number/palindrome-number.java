class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int res=0;
        while(x>0){
            res=(x%10)+res*10;
            x/=10;
            
        }
        System.out.print(res);
        if(copy==res){
            return true;
        }
        return false;
    }
}