class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int l1=nums1.length;
        int l2=nums2.length;
        int totallen=l1+l2;
        
        int left=0;
        int ryt=l1;
        while(left <= ryt){
            int part1=(left+ryt) /2;
            int part2= (totallen+1)/2 - part1;
            int left1=(part1==0)?Integer.MIN_VALUE : nums1[part1-1];
            int ryt1=(part1==l1)? Integer.MAX_VALUE : nums1[part1];
            
            int left2=(part2==0)?Integer.MIN_VALUE : nums2[part2-1];
            int ryt2=(part2==l2)? Integer.MAX_VALUE : nums2[part2];
            
            if (left1 <= ryt2 && left2 <= ryt1) {
                // If total length is odd
                if (totallen % 2 != 0) {
                    return Math.max(left1, left2);
                }
                // If total length is even
                else {
                    return (Math.max(left1, left2) + Math.min(ryt1, ryt2)) / 2.0;
                }
            }
            // If partition is not correct, adjust the boundaries
            else if (left1 > ryt2) {
                ryt = part1 - 1;
            }
            else {
                left = part1 + 1;
            }
        }
        return 0.0;
        
    }
}