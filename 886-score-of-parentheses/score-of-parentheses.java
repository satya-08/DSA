class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }else{
                int ins=stack.pop();
                int sc=(ins==0)?1:2*ins;
                int prev=stack.pop();
                stack.push(prev+sc);
            }
        }
        return stack.pop();
    }
}