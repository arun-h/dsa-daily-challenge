class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        
        int mPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;++i){
            maxProfit=Math.max(maxProfit, prices[i]-mPrice);
            mPrice=Math.min(mPrice,prices[i]);
        }
        return maxProfit;    
    }
}

