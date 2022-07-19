class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sublist= new ArrayList<>();
        sublist.add(1);
        ans.add(sublist);
        int row=1;
        
        while(row<numRows)
        {
            List<Integer> previousList=ans.get(row-1);
            List<Integer> newList=new ArrayList<>();
            
            for(int i=0;i<=row;i++)
            {
                int leftElement= i>=1? previousList.get(i-1):0;
                int rightElement = i<row? previousList.get(i):0;
                newList.add(leftElement+rightElement);
            }
            
            ans.add(newList);
            row++;
        
        }
        
        return ans;
    }
}