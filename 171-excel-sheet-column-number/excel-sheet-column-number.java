class Solution {
    public int titleToNumber(String str) {
        int res=0;
        for(char ch:str.toCharArray()){
            res=res*26+(ch-'A'+1);
        }
        return res;
    }
}