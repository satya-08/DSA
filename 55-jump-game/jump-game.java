class Solution {
    public boolean canJump(int[] nums) {
        int findes=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=findes)
            findes=i;
        }
        return (findes==0);
        
    }
}