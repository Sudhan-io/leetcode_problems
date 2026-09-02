class Solution {
    public boolean judgeCircle(String moves) {
        int U=0;
        int L=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') U+=1;
            else if(moves.charAt(i)=='D') U-=1;
            else if(moves.charAt(i)=='L') L+=1;
            else if(moves.charAt(i)=='R') L-=1;
        }
        return U==0&&L==0;
    }
}