class Solution {
    public boolean isPowerOfTwo(int n) {
     
        //        for 2 power wale no has only 1 bit  
        
        if(n<=0)
            return false;
        
        int count=0;
        
        while(n!=0)
        {
           int var= n & 1 ;
           if(var==1)
               count++;
            
            n = n>>1;
        }
        
        return count==1;
    }
}