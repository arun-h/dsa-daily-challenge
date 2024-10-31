class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        
        int[] bed=flowerbed.clone();
        int count=0;
        for(int i=0; i<bed.length;i++){
            if(bed[i]==0) {
                boolean leftempty= (i==0) || bed[i-1]==0;
                
                boolean rytempty=(i==bed.length-1) || bed[i+1]==0;
                if(leftempty && rytempty){
                    bed[i]=1;
                    count++;
                    
                }
                if(count==n) return true;
            }
        }
        return false; 
    }
}