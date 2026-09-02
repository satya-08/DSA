class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0;
        int r=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]==nums2[r]){
                arr.add(nums1[l]);
                l++;
                r++;
            }else if(nums1[l]>nums2[r]){
                r++;
            }else{
                l++;
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}