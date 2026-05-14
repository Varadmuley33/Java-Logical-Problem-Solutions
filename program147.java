////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program147.java
//  Description :   Finds and displays the minimum number from the
//                  entered array elements.
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

class Program147
{
    public static int Minimum(int Arr[], int iSize)
    {
        int iMin = 0;
        int iCnt = 0;

        for(iMin = Arr[iCnt], iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
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

        iRet = Minimum(iPtr, iLength);

        System.out.println("Minimum number is : " + iRet);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
