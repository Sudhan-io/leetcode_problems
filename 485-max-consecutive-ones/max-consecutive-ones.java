class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){ c+=1;}
            else{ c=0;}
            mc=Math.max(c,mc);
        }
        return mc;
    }
}