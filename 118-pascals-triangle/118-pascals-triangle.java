class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> ans=new ArrayList<>();
        int row=1;
        
        List<Integer> sublist=new ArrayList<>();
        sublist.add(1);
        ans.add(sublist);
        
        
        while(row<numRows)
        {
            List<Integer> previousList=ans.get(row-1);
            List<Integer> newSubList=new ArrayList<>();
            
            for(int i=0;i<=row;i++)
            {
                int leftelement= i>=1?previousList.get(i-1):0;
                int rightelement = i<row?previousList.get(i):0;
                newSubList.add(leftelement+rightelement);
            }
            
            ans.add(newSubList);
            row++;
        }
        
        return ans;
    }
}