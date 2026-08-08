class Solution {
    public int maxArea(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int max=0;
        while(l<r){
            max=Math.max(max,Math.min(nums[l],nums[r])*(r-l));
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}