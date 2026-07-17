class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for( int each : nums){
            if(numbers.contains(each)){
                return true;
            }
            numbers.add(each);
        }
        return false;
    }
}