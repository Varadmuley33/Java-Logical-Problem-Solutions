////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program141.java
//  Description :   Searches a user entered number from the array using
//                  Linear Search with direct condition return.
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

class Program141
{
    // O(N)
    public static boolean LinearSearch(int Arr[], int iSize, int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }

        return (iCnt == iSize);     // Its Wrong
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0, iValue = 0;
        boolean bRet = false;

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

        System.out.print("Enter the number you want to search : ");
        iValue = sobj.nextInt();

        bRet = LinearSearch(iPtr, iLength, iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is present in given elements");
        }
        else
        {
            System.out.println(iValue + " is not present in given elements");
        }

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
