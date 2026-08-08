class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int n=nums.length;
        if(n<=1) return 1;
        for(int r=1;r<n;r++){
            if(nums[left]==nums[r]){
                continue;
            }else{
                left++;
                nums[left]=nums[r];
            }
        } 
        return left+1;       
    }
}