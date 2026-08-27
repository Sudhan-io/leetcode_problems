class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        while(columnNumber>0){
        columnNumber--;
        int rem=columnNumber%26;
        s += (char)('A' + rem);
        columnNumber/=26;}
        return new StringBuilder(s).reverse().toString();
    }
}