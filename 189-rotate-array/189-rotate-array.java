class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] temparr=new int[nums.length];
        int startIndx=nums.length-k;
        int indx=0;
        
        if(startIndx<0)
        {
            k= k%nums.length;
            startIndx=nums.length-k;
        }
    
        
        for(int i=startIndx;i<nums.length;i++)
        {
            temparr[indx]=nums[i];
            indx++;
        }
        
        for(int i=0;i<startIndx;i++)
        {
            temparr[indx]=nums[i];
            indx++;
        }
        
        for(int i=0;i<temparr.length;i++)
        {
            nums[i]=temparr[i];
        }
    }
    
    
}