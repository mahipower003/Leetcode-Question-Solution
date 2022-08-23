class Solution {
    public int firstMissingPositive(int[] nums) {
        
      LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],nums[i]);
        }
        
        int i=1;
        
        while(true)
        {
           if(map.get(i)==null)
               return i;
            
            i++;
        }
        
    }
}