class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]!=' '){
                sb1.append(arr[i]);
            }else{
                sb2.append(sb1.reverse()).append(' ');
                sb1.setLength(0);
            }
        }
        sb2.append(sb1.reverse());
        return sb2.toString();
    }
}