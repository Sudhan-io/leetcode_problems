class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                arr.push(i);
            }
            else{
                if(arr.isEmpty()) return false;
            char top=arr.pop();
            if(i==')' && top!='(')  return false;
            if(i=='}' && top!='{') return false;
            if(i==']' && top!='[') return false;
        }}
        return arr.isEmpty();
    }
}
