class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int numstart=0;
        int count=0;
        
        while(count!=k)
        {
            numstart+=1;
            boolean flag=false;
            
            for(Integer no:arr)
            {
                if(no.equals(numstart))
                    flag=true;
            }
            
            if(!flag)
                count++;
        }
        
        return numstart;
        
    }
}