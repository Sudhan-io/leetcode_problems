class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int l=0;
        for(int i=0;i<n;i++){
            ans[l++]=nums[i];
            ans[l++]=nums[i+n];
        }
        return ans;
    }
}