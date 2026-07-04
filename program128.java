////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program128.java
//  Description :   Calculates summation of array elements using loop.
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

class Program128
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Summation
    //  Description :   Calculates addition of array elements.
    //  Input :         Integer Array, Integer
    //  Output :        Integer
    //
    /////////////////////////////////////////////////////////////////

    public static int Summation(int Arr[], int iSize)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
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

        if(null == ptr)      // Industrial way of coding
        {
            System.out.println("Unable to allocate the memory");
            return;
        }

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            ptr[iCnt] = sobj.nextInt();
        }

        iRet = Summation(ptr, iLength);
        System.out.println("Addition of Numbers is : " + iRet);
    }
}   // End of main
