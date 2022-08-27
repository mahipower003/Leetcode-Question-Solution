class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int temp: nums)
        {
            if(map.containsKey(temp))
            {
                map.put(temp, map.get(temp)+1);
            }
            else
            {
               map.put(temp, 1);   
            }
        }
        
        int count=0;
        int result=nums[0];
        
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
           
            if(mapElement.getValue()>count)
            {
                count=mapElement.getValue();
                result= mapElement.getKey();
            }
        }
        
        return result;
        
    }
}