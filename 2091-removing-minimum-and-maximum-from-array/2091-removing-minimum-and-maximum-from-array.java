class Solution {
    public int minimumDeletions(int[] nums) {
        
        int maxPos=0;
        int max=Integer.MIN_VALUE;
        int minPos=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                maxPos=i;
                max=nums[i];
            }
            
            if(nums[i]<min)
            {
                minPos=i;
                min=nums[i];
            }
        }
        
        int a=Math.min(maxPos,minPos);
        int b=Math.max(maxPos,minPos);
        
        
       return Math.min(Math.min(b-a,n-b)+a+1 , n-a);
        
    }
}