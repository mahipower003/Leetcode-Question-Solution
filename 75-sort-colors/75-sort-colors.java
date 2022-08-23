class Solution {
    public void sortColors(int[] nums) {
        
        int[] arr=new int[3];
        
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]=arr[nums[i]]+1;
            
        }
        
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            arr[i]=sum;
        }
        
        int[] output=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--)
        {
            output[--arr[nums[i]]]=nums[i];
        }
        
        for(int i=0;i<output.length;i++)
        {
            nums[i]=output[i];
        }
       
    }
}