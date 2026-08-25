class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        //s=s.toLowerCase();
        int mid=s.length()/2;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i<mid){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U') count++;
            }else{
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U') count--;

            }
        }
        return count==0;
    }
}