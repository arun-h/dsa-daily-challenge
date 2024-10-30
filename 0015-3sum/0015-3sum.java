class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left=i+1;
            
            int ryt= nums.length-1;
            while(left < ryt) {
                int sum= nums[left]+nums[ryt]+nums[i];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[ryt]);
                    ans.add(triplet);
                    
                    while (left < ryt && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < ryt && nums[ryt] == nums[ryt - 1]) {
                        ryt--;
                    }
                    left++;
                    ryt--;
                } else if (sum < 0) {
                    left++;
                } else {
                    ryt--;
                }
                
            }

        }
        return ans;
        
    }
}