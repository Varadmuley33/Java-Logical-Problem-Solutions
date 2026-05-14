////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program150.java
//  Description :   Displays all array elements in reverse order.
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

class Program150
{
    public static void ReverseDisplay(int Arr[], int iSize)
    {
        int iCnt = 0;

        for(iCnt = iSize - 1; iCnt >= 0; iCnt--)
        {
            System.out.println(Arr[iCnt]);
        }
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

        ReverseDisplay(iPtr, iLength);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
