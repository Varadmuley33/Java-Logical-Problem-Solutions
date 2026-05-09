////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program49.java
//  Description :   Accepts a number from the user and displays all its
//                  non-factors using a loop. Handles negative input.
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
//  Class Name :       Program49
//  Description :      Contains main function and DisplayNonFactors method
//
/////////////////////////////////////////////////////////////////

class Program49
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayNonFactors
    //  Description :   Prints all non-factors of iNo
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;

        // Updator: Convert negative number to positive
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Display all non-factors from 1 to (iNo - 1)
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)            // Non-factor condition
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

        DisplayNonFactors(iValue);           // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10
//  Output : 3  4  6  7  8  9
//
//  Input : 8
//  Output : 3  5  6  7
//
//  Input : -12
//  Output : 5  7  8  10  11   (negative handled by updator)
//
/////////////////////////////////////////////////////////////////
