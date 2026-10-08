class Solution {
    public String removeOuterParentheses(String s) {
        int outer=0;
        String res="";
        for(char ch:s.toCharArray()){
            if(ch=='('){
                outer++;
            }
            if(outer>1){
                res+=ch;
            }
            if(ch==')') outer--;
        }
        return res;
    }
}