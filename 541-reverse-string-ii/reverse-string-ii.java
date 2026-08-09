class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        // if(n<k)
        // return new String(new StringBuilder(s).reverse());
        int l=0;
        int r=k;
        char[] arr=s.toCharArray();
        while(r<=n){
            reverse(arr,l,r-1);
            l+=2*k;
            r+=2*k;
        }
        reverse(arr,l,n-1);
        return new String(arr);
    }
    private static void reverse(char[] arr,int l,int r){
        while(l<r){
            char t=arr[l];
            arr[l++]=arr[r];
            arr[r--]=t;
        }
    }
}