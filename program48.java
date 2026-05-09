////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program48.java
//  Description :   Accepts a number from the user (handles negative input)
//                  and displays all its factors using a loop.
//  Author :        Varad Nitin Muley
//  Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :       Program48
//  Description :      Contains main function and DisplayFactors method
//
/////////////////////////////////////////////////////////////////

class Program48
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description :   Prints factors of iNo after converting negative
    //                  input to positive.
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        // Updator: Convert negative number to positive
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Display all factors from 1 to iNo - 1
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)       // Factor condition
            {
                System.out.println(iCnt);
            }
        }
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter Number : ");
        iValue = sobj.nextInt();

        DisplayFactors(iValue);
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Time Complexity : O(N)
//
/////////////////////////////////////////////////////////////////
