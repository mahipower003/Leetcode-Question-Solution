class Solution {
    public void nextPermutation(int[] nums) {
        
        int lowInd = -1;
        int highInd = nums.length-1;
        
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i-1]<nums[i])
            {
                lowInd=i-1;
                break;
            }
        }
        
        if(lowInd==-1)
        {
             reverse(nums, 0, nums.length-1);
            return ;
        }
        
        for(int i=nums.length-1;i>=lowInd+1;i--)
        {
            if(nums[lowInd]<nums[i])
            {
                highInd = i;
                break;
            }
        }
        
        int temp= nums[lowInd];
        nums[lowInd] = nums[highInd];
        nums[highInd]=temp;
        lowInd++;
        
        reverse(nums, lowInd, nums.length-1);
    }
    
    private void reverse(int[] nums, int lowInd , int highInd)
    {
        while(lowInd<highInd)
        {
            int temp= nums[lowInd];
            nums[lowInd] = nums[highInd];
            nums[highInd]=temp;
            highInd--; lowInd++;
        }
    }
}