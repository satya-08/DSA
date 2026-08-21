class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        if(n==1) return 0;
        int maxcount=0;
        for(int i=1;i<n;i++){
            if(colors[0]!=colors[i]){
                maxcount=Math.max(maxcount,Math.max(i,n-i-1));
            }
        }
        // for(int i=n-2;i>=0;i--){
        //     if(colors[n-1]!=colors[i]){
        //         maxcount=Math.max(maxcount,n-i-1);
        //     }
        // }
        return maxcount;
    }
}