class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0;
        int r=0;
        int m=word1.length();
        int n=word2.length();
        String res="";
        while(l<m && r<n){
            res+=word1.charAt(l++);
            res+=word2.charAt(r++);
        }
        if(l<m){
            res+=word1.substring(l,m);
        }
        if(r<n){
            res+=word2.substring(r,n);
        }
        return res;
    }
}