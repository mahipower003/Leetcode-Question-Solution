class Solution {
    public void rotate(int[][] matrix) {
        
        int rowLength=matrix.length;
        int colLength=matrix[0].length;
        
        transpose(matrix,rowLength,colLength);
        rotate(matrix,rowLength,colLength);
        }
    
    public void transpose(int[][] matrix, int rowlength, int collength)
    {
        for(int i=0;i<rowlength;i++)
        {
           for(int j=i+1;j<collength;j++)
           {
               int temp=matrix[j][i];
               matrix[j][i]=matrix[i][j];
               matrix[i][j]=temp;
           }
        }
    }
    
    public void rotate(int[][] matrix, int rowlength, int collength)
    {
        for(int i=0;i<rowlength;i++)
        {
            int swapelemt=collength-1;
           for(int j=0;j<collength/2;j++)
           {
               int temp=matrix[i][swapelemt];
               matrix[i][swapelemt]=matrix[i][j];
               matrix[i][j]=temp;
               swapelemt--;
           }
        }
    }
}