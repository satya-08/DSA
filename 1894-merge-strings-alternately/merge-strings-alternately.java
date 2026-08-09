class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int n=word1.length();
        int m=word2.length();
        char[] str=new char[n+m];
        int l=0,r=0,k=0;
        while(k<m+n){
            if(r==m){
                str[k++]=w1[l++];
            }else if(l==n){
                str[k++]=w2[r++];
            }else{
                str[k++]=w1[l++];
                str[k++]=w2[r++];
            }
        }
        return new String(str);
    }
}