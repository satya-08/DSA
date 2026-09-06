class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int maxArea=0;
        while(l<r){
            if(Math.min(arr[l],arr[r])*(r-l)>maxArea){
                maxArea=Math.min(arr[l],arr[r])*(r-l);
            }else if(arr[l]>arr[r]){
                r--;
            }else
            l++;
            
        }
        return maxArea;
        
    }
}