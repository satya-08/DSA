class Solution {
    public String removeOuterParentheses(String s) {
        int outer=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                outer++;
            }
            if(outer>1){
                sb.append(ch);
            }
            if(ch==')') outer--;
        }
        return sb.toString();
    }
}