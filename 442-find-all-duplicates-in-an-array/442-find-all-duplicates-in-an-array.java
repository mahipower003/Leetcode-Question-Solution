class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        
        for(int temp:nums)
        {
            if(map.containsKey(temp))
            {
                result.add(temp);
            }
            else
                map.put(temp,1);
        }
        
        return result;
    }
}