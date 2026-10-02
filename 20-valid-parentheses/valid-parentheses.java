class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='[') stack.push(ch);
            else{
                if(stack.size()==0) return false;
                if(ch==')' && stack.pop()!='(') return false;
                if(ch=='}' && stack.pop()!='{') return false;
                if(ch==']' && stack.pop()!='[') return false;
                }
            }
            return stack.isEmpty();
        }
    
}