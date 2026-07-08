////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program123.java
//  Description :   Prints values of an array using a loop.   
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

class Program123
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays array elements using loop.
    //  Input :         Integer Array, Integer
    //  Output :        None
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int Arr[], int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0;
        int ptr[] = null;

        System.out.print("Enter number of elements : ");
        iLength = sobj.nextInt();

        ptr = new int[iLength];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            ptr[iCnt] = sobj.nextInt();
        }

        Display(ptr, iLength);
    }
}   // End of main
