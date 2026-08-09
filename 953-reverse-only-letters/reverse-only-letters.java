class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            while(l<r &&!Character.isLetter(arr[l])){
                l++;
            }
            while(l<r && !Character.isLetter(arr[r])){
                r--;
            }
                char t=arr[l];
                arr[l++]=arr[r];
                arr[r--]=t;

        }
        return new String(arr);
    }
    
}