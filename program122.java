////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program122.java
//  Description :   Counts positive numbers from an array entered by user.
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

class Program122
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountPositive
    //  Description :   Counts positive numbers from the array.
    //  Input :         Integer Array, Integer
    //  Output :        Integer
    //
    /////////////////////////////////////////////////////////////////

    public static int CountPositive(int Arr[], int iSize)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > 0)
            {
                iCount++;
            }
        }

        return iCount;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0, iRet = 0;
        int ptr[] = null;

        System.out.print("Enter number of elements : ");
        iLength = sobj.nextInt();

        ptr = new int[iLength];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            ptr[iCnt] = sobj.nextInt();
        }

        iRet = CountPositive(ptr, iLength);
        System.out.println("Positive numbers are  : " + iRet);
    }
}   // End of main
