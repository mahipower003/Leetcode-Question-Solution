class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int sum=nums[i];
            
            if(i!=nums.length-1)
            {
                for(int j=i+1;j<nums.length;j++)
               {
                sum=sum+nums[j];
                
                if(sum==k)
                {
                    count++;
                }
                } 
            } 
            
            if(nums[i]==k)
                count++;
            
            
            
        }
        
        return count;
    }
}