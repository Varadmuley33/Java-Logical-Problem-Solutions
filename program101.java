

import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        System.out.println("Elements of array are");
        for(iCnt = 0; iCnt<Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            if((Brr[iCnt]% 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }

}


class program101
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
            
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iRet = aobj.CountEven(Arr);

        System.out.println("Number of even elements :" +iRet);
        

        aobj = null;
        Arr = null;
        sobj = null;

    }
}


