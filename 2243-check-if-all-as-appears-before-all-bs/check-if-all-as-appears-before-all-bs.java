class Solution {
    public boolean checkString(String s) {
        boolean flag=false;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                flag=true;
            }else{
                if(flag){
                    return false;
                }
            }
        }
        return true;
    }
}