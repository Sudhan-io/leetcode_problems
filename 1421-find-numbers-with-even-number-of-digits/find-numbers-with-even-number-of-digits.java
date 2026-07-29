class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int co=0;
            while(nums[i]>0){
                nums[i]/=10;
                co+=1;
            }
            if(co%2==0) c+=1;
        }
        return c;
    }
}