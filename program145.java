////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program145.java
//  Description :   Finds and displays the maximum number from the
//                  entered array elements using first element initialization.
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

class Program145
{
    public static int Maximum(int Arr[], int iSize)
    {
        int iMax = 0;
        int iCnt = 0;

        iMax = Arr[0];      // Important

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }

        return iMax;
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

        iRet = Maximum(iPtr, iLength);

        System.out.println("Maximum number is : " + iRet);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
