class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            //for(int j=0;j<word.length()-patterns[i].length()+1;j++){
                //if(word.substring(j,j+patterns[i].length()).equals(patterns[i])){ count++;
                //break;}
            //}
            if(word.contains(patterns[i])) count++;
        }return count;
    }
}