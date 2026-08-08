class Solution {
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        int l=0,r=s.length()-1;
        char[] arr=s.toCharArray();
        while(l<r){
            while(l<r && str.indexOf(arr[l])==-1){
                l++;
            }
            while(l<r && str.indexOf(arr[r])==-1){
                r--;
            }
            char ch=arr[l];
            arr[l]=arr[r];
            arr[r]=ch;
            l++;
            r--;
        }
        return new String(arr);
    }
}