class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int start=0;
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                reverse(arr,start,i-1);
                start=i+1;
            }
        }
        reverse(arr,start,n-1);
        return new String(arr);
    }
    private static void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}