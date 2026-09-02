class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans=-1;
        int n=nums.length;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/2&&ans<e.getValue()){
                ans=e.getKey();
            }
        }
        return ans;
    }
}