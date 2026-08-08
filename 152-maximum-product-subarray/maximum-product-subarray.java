class Solution {
    public int maxProduct(int[] nums) {
        int currMaxPro=nums[0], currMinPro=nums[0];  // Max & Min product ending at current index
        int maxPro=nums[0]; // Best maximum product
        for(int i=1;i<nums.length;i++){
            // If current number is negative, curr max and min products swap roles.
            if(nums[i]<0){
                int temp=currMaxPro;
                currMaxPro=currMinPro;
                currMinPro=temp;
            }
            // Either start a new subarray or extend the previous maximum product.
            currMaxPro=Math.max(currMaxPro*nums[i],nums[i]);
            currMinPro=Math.min(currMinPro*nums[i],nums[i]); // Same condn 
            maxPro=Math.max(currMaxPro,maxPro); // Update overall maximum product.
        }
        return maxPro;
    }
}