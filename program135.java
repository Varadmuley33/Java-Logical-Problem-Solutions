////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program135.java
//  Description :   Counts and displays the frequency of number 11
//                  from the entered array elements.
//  Author :        Varad Nitin Muley
//  Date :          14/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program135
{
    public static int FrequencyCalculate(int Arr[], int iSize)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0, iRet = 0;
        int iPtr[];

        System.out.println("Enter the number of elements : ");
        iLength = sobj.nextInt();

        // Step 1 : Allocate the memory
        iPtr = new int[iLength];

        System.out.println("Enter the values : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iPtr[iCnt] = sobj.nextInt();
        }

        iRet = FrequencyCalculate(iPtr, iLength);

        System.out.println("Frequency of 11 is : " + iRet);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
