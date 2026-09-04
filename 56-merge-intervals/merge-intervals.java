class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int[][] res=new int[n][2];
        res[0]=intervals[0];
        int k=1;
        for(int i=1;i<n;i++){
            int[] last=res[k-1];
            int[] curr=intervals[i];

            if(curr[0]<=last[1]){
                last[1]=Math.max(last[1],curr[1]);
            }
            else{
                res[k][0]=curr[0];
                res[k++][1]=curr[1];
            }
        }
        return Arrays.copyOf(res,k);

    }
}