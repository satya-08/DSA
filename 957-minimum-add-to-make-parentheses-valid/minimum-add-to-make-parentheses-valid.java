class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> stack=new Stack<>();
        // int res=0;
        // for(char ch:s.toCharArray()){
        //     if(ch=='(') stack.push(ch);
        //     else{
        //         if(stack.isEmpty()) res++;
        //         else{
        //             stack.pop();
        //         }
        //     }
        // }
        // return res+stack.size();

        int open=0,ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') open++;
            else{
                if(open>0) open--;
                else ans++;
            }
        }
        return ans+open;
    }
}