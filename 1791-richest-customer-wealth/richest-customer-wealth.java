class Solution {
    public int maximumWealth(int[][] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums[0].length;j++){
                temp+=nums[i][j];
            }
            if(temp>max) max=temp;
        }
        return max;
    }
}