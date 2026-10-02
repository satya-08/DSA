class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(0,0,"",res,n);
        return res;
    }

    private static void generate(int open,int close,String curr,List<String> res,int n){
        if(curr.length()==2*n){
            res.add(curr);
            curr="";
            return;
        }
        if(open<n){
            generate(open+1,close,curr+"(",res,n);
        }if(close<open){
            generate(open,close+1,curr+")",res,n);
        }
    }
}