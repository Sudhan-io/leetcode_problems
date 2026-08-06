class Solution {
    public int pivotIndex(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int j=nums.length-2;
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]+nums[i-1];
            r[j]=r[j+1]+nums[j+1];
            j--;
        }
        for(int i=0;i<nums.length;i++){
            if(l[i]==r[i]) return i;
        }
        return -1;
    }
}