class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            int ind=Math.abs(num)-1;
            nums[ind]=-Math.abs(nums[ind]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        
        }
        return list;
    }
}