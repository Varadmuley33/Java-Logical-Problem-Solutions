////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program148.java
//  Description :   Increments each element of the array by one and
//                  displays the updated array elements.
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

class Program148
{
    public static void Update(int Arr[], int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt]++;
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

        Update(iPtr, iLength);

        System.out.println("Updated data from array is : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println(iPtr[iCnt]);
        }

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
