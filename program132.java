////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program132.java
//  Description :   Calculates and displays the average of all entered
//                  array elements using floating point division.
//  Author :        Varad Nitin Muley
//  Date :          13/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program132
{
    public static float Average(int Arr[], int iSize)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return ((float)iSum / (float)iSize);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0;
        float fRet = 0;

        System.out.print("Enter number of elements : ");
        iLength = sobj.nextInt();

        int ptr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            ptr[iCnt] = sobj.nextInt();
        }

        fRet = Average(ptr, iLength);

        System.out.println("Average of elements is : " + fRet);

        sobj.close();
    }
}   // End of main
