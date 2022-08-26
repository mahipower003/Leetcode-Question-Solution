public class Solution {
    public static boolean reorderedPowerOf2(int n) {


        int[] inputArr=new int[10];

        for(int i=n;i>0;i=i/10)
        {
            inputArr[i%10]++;
        }

        int poweroftwo=1;
        int digit=1;

        while(digit<32)
        {
            if(comparesame(poweroftwo,inputArr)) return true;
            poweroftwo*=2;
            digit++;
        }

        return false;
    }

    private static boolean comparesame(int poweroftwo, int[] inputArr)
    {
        int[] poweroftwoarr=new int[10];
        int start=0;

        for(int i=poweroftwo;i>0;i=i/10)
        {
            poweroftwoarr[i%10]++;
        }

        for(int i=0;i<poweroftwoarr.length;i++)
        {
            if(poweroftwoarr[i]!=inputArr[i]) return false;
        }

        return true;
    }

}