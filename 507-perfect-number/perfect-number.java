class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=num;
        if(num==1) return false;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(i!=1) sum+=(num/i);
            }
        }

        if(n==sum)return true;
        return false;
    }
}