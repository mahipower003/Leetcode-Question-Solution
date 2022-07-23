class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        
        
        for(int no:nums)
        {
            if(!set.remove(no))
                set.add(no);
            else
                return no;
        }
        
        
        return 0;
        
    }
}