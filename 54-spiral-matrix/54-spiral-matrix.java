class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if (matrix.length == 0)
           return new ArrayList<>();
        
        int startrowind=0;
        int startcolind=0;
        int endrowind=matrix.length-1;
        int endcolind=matrix[0].length-1;
        List<Integer> result=new ArrayList<>();
        int size=matrix.length*matrix[0].length;

       while(result.size()!=size)
        {

            for(int i=startcolind;i<=endcolind && result.size()!=size;i++)
            {
                result.add(matrix[startrowind][i]);
            }

            startrowind++;

            for(int i=startrowind;i<=endrowind && result.size()!=size;i++)
            {
                result.add(matrix[i][endcolind]);
            }

            endcolind--;

            for(int i=endcolind;i>=startcolind && result.size()!=size;i--)
            {
                result.add(matrix[endrowind][i]);
            }

            endrowind--;

            for(int i=endrowind;i>=startrowind && result.size()!=size;i--)
            {
                result.add(matrix[i][startcolind]);
            }

            startcolind++;
        }
        
        return result;
    }
}