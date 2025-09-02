// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int profit = 0;
        int buy = -1, sell = 0;
        
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                if(buy==-1){
                    buy = prices[i];
                }
            }
            if(prices[i]>prices[i+1]){
                if(i!=0 && buy!=-1){
                    sell = prices[i];
                    profit += sell - buy;
                    buy=-1;
                }
            }
            if(i+1 == prices.length-1 && buy!=-1){
                sell = prices[i+1];
                profit += sell - buy;
            }
        }
        return profit;
    }
}