class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
        // int l=0;
        // int r=1;
        // int k=1;
        // if(n==1) return 1;
        // while(l<n && r<n){
        //     if(nums[l]==nums[r]){
        //         r++;
        //     }else{
        //         l++;
        //         nums[l]=nums[r];
        //         k++;
        //         r++;
        //     }
        // }
        // return k;

        int i=0;
        for(int j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}