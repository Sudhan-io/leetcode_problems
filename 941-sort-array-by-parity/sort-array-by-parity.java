class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        //insight:slow fast pointer method
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int tmp=nums[l];
                nums[l]=nums[i];
                nums[i]=tmp;
                l++;
            }
        }
        return nums;
    }
}