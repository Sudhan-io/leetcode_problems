class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] soln=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                soln[i]=nums[left]*nums[left];
                left++;
            } else{
                soln[i]=nums[right]*nums[right];
                right--;
            }
            //soln[ind--]=Math.max(nums[left],nums[right]);
        }
        /*while(left<right && ind!=-1){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                nums[ind]=nums[left]*nums[right];
                left++;
                ind--;
            }else{
                nums[ind]=nums[right]*nums[right];
                right--;
                ind--;
            }
        }*/

        return soln;
    }
}