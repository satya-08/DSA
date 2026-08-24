class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        int count=0;
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            int req=currsum-k;
            if(hs.containsKey(req)){
                count+=hs.get(req);
            }
            hs.put(currsum,hs.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}