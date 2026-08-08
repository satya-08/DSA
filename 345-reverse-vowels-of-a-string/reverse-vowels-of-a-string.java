class Solution {
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        int l=0,r=s.length()-1;
        char[] arr=s.toCharArray();
        while(l<r){
            while(l<r && !isVowel(arr[l])){
                l++;
            }
            while(l<r && !isVowel(arr[r])){
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
    private static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
}}