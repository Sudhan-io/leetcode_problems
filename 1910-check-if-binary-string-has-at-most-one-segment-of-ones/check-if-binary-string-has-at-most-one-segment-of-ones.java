class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0') return false;
        }
        return true;
    }
}