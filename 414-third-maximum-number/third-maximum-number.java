class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long t=Long.MIN_VALUE;
        for(int num : nums){
            if(num!=f && num!=s && num!=t){
                if(num>f){
                    t=s;
                    s=f;
                    f=num;
                }else if(num>s){
                    t=s;
                    s=num;
                }else if(num>t){
                    t=num;
                }
            }
        }
        if(t==Long.MIN_VALUE) return (int) f;
        return (int) t;
    }
}