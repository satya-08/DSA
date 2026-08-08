class Solution {
    public boolean isSubsequence(String s, String t) {
       int l=0;
       int r=0;
       int n=s.length();
       int m=t.length();
       while(l<n && r<m) {
        if(s.charAt(l)==t.charAt(r)){
            l++;
        }
        r++;
       }
       return l==n;
    }
}