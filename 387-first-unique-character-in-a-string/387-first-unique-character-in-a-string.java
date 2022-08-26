class Solution {
    public int firstUniqChar(String s) {
     
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), 2);
            } else
            {
                map.put(s.charAt(i), 1);
            }
        }
        
       for(int i=0;i<s.length();i++)
       {
           if(map.get(s.charAt(i))==1)
               return i;
       }
        
        return -1;
    }
}