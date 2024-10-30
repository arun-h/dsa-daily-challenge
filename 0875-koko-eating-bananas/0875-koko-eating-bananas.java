class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int ryt=Arrays.stream(piles).max().orElse(0);
        
        while(left < ryt) {
            int mid= left + (ryt-left)/2;
            if(isFeasible(piles,h,mid)){
                ryt=mid;
            }else{
                left=mid+1;
            }
        }
        return left;             
    }
    
    private boolean isFeasible(int[] piles, int h, int speed) {
        int hrs=0;
        for(int p :piles) {
            hrs += (p-1) / speed+1;
        }
        return hrs <= h;
            
    }
}