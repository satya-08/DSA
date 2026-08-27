class Solution {
    public int maxProfit(int[] arr) {
        int profit=0;
		int n=arr.length;
		int maxPrice=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			profit=Math.max(profit,maxPrice-arr[i]);
			if(maxPrice<arr[i]) maxPrice=arr[i];
		}
		return profit;
    }
}