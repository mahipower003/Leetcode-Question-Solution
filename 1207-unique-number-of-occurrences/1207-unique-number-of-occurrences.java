class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int value=map.get(arr[i])+1;
                map.put(arr[i],value);
            } else
            {
                map.put(arr[i],1);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
        {
            if(set.contains(entry.getValue()))
                return false;
            else
                set.add(entry.getValue());
                
        }
        
        return true;
    }
}