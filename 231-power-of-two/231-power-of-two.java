class Solution {
    public boolean isPowerOfTwo(int n) {
     
        //        for 2 power wale no has only 1 bit  
        
        if(n<1) return false;
        int no=1;
        int bit=0;
        
        while(bit<32)
        {   
          if(no==n) 
              return true;
          else
          {
              no=no*2;
                bit++;
          }
            
        
        }
        
        return false;
    }
}