////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program136.java
//  Description :   Counts and displays the frequency of a user entered
//                  number from the array elements.
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

class Program136
{
    public static int FrequencyCalculate(int Arr[], int iSize, int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0, iRet = 0, iValue = 0;
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

        System.out.print("Enter the number you want to calculate the frequency : ");
        iValue = sobj.nextInt();

        iRet = FrequencyCalculate(iPtr, iLength, iValue);

        System.out.println("Frequency of " + iValue + " is : " + iRet);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
