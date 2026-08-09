class Solution {
    public int possibleStringCount(String word) {
        char[] arr=word.toCharArray();
        int count=1;
        for(int i=1;i<word.length();i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
        }
        return count;
    }
}