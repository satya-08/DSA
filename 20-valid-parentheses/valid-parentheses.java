class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack =new Stack<>();
		for(char ch:str.toCharArray()) {
			if(stack.isEmpty() && (ch==')'||ch=='}'||ch==']')) return false;
			if(ch=='{'||ch=='('||ch=='[') stack.push(ch);
			else {
				if(ch=='}' && stack.peek()=='{') stack.pop();
				else if(ch==']' && stack.peek()=='[') stack.pop();
				else if(ch==')' && stack.peek()=='(') stack.pop();
				else return false;
			}
		}
		return stack.isEmpty();
    }
}