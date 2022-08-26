public class Solution {
    public boolean reorderedPowerOf2(int N) {
        int[] digits = new int[10];
        for (int i = N; i > 0; i /= 10) 
        {
            digits[i % 10]++;
        }
        int num = 1;
        int bits = 1;
        while (bits < 32) {
            if (isDigitsMatch(num, digits)) {
                return true;
            }
            num =num*2;
            ++bits;
        }
        return false;
    }

    private boolean isDigitsMatch(int n, int[] digits) 
    {        
        int[] temp = new int[10];
        for (int i = n; i > 0; i /= 10) 
        {
            temp[i % 10]++;
        }
        int j=0;
        while(j<10)
        {
            if(temp[j]!=digits[j]) return false;
            j++;
        }
        return true;
    }

}