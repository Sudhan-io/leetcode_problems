class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char i:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=i) stack.push(i);
            else{
                stack.pop();
                //if(i==stack.peek()) stack.pop();
            }
        }
        String st="";
        for(char i: stack){
            st+=i;
        }
        return st;
    }
}