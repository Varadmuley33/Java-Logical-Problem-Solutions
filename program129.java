////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program129.java
//  Description :   Counts even numbers from an array.
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

class Program129
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountEven
    //  Description :   Counts even numbers from the array.
    //  Input :         Integer Array, Integer
    //  Output :        Integer
    //
    /////////////////////////////////////////////////////////////////

    public static int CountEven(int Arr[], int iSize)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
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

        iRet = CountEven(ptr, iLength);
        System.out.println("Even numbers are  : " + iRet);
    }
}   // End of main
