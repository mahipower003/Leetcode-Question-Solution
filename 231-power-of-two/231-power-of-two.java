class Solution {
    public boolean isPowerOfTwo(int n) {
     
        //        for 2 power wale no has only 1 bit  
        
        if(n<1) return false;
        
        return (n&(n-1))==0?true:false;
    }
}