class Solution {
    public int search(int[] nums, int target) {
        
        int leftInd=0;
        int rightInd=nums.length-1;
        
        while(leftInd<=rightInd)
        {
            int midInd=(leftInd+rightInd)/2;
            if(nums[midInd]==target)
                return midInd;
            else if(nums[midInd]<target)
                leftInd = midInd+1;
            else
                rightInd = midInd-1;                
        }
        
        return -1;
        
    }
}