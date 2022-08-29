class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rowflag=1;
        int rowlen= matrix.length;
        int collen= matrix[0].length;
        
        for(int i=0;i<rowlen;i++)
        {
            if(matrix[i][0]==0)
                rowflag =0;
            
            for(int j=1;j<collen;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=rowlen-1; i>=0;i--)
        {
            for(int j=collen-1;j>=1;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                {
                    matrix[i][j] = 0;
                }
            }
            
            if(rowflag==0)
                matrix[i][0]= 0;
        }
        
    }
}