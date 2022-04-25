class Solution {
    public int findComplement(int num) {
        
        int index=0;
        int output=0;

        int inputbinary[]=new int[40];

        while(num!=0)
        {
            inputbinary[index++]=num%2;
            num=num/2;
        }

        int pow=0;
        boolean flag=true;

        for(int i=inputbinary.length-1;i>=0;i--)
        {
           if(inputbinary[i]==0)
               output= (int) (output+1*Math.pow(2,i));
           else
           {
               flag=false;
               output= (int) (output+0*Math.pow(2,i));
           }

           pow++;

            if(flag)
            {
                pow=0;
                output=0;
            }

        }
        
        return output;
        
    }
}