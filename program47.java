////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program47.java
//  Description :   Displays all factors of a user-entered number using
//                  an efficient loop-based approach.
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
//  Class Name :       Program47
//  Description :      Contains main function and DisplayFactors method
//
/////////////////////////////////////////////////////////////////

class Program47
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description :   Prints all factors of iNo using a loop
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayFactors(int iNo)
    {
        int iCnt = 0;                       // Loop counter

        for(iCnt = 1; iCnt < iNo; iCnt++)  // Check from 1 to (iNo - 1)
        {
            if((iNo % iCnt) == 0)           // Factor condition
            {
                System.out.println(iCnt);  // Print factor
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

        DisplayFactors(iValue);             // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6
//  Output : 1  2  3
//
//  Input : 12
//  Output : 1  2  3  4  6
//
//  Input : 10
//  Output : 1  2  5
//
/////////////////////////////////////////////////////////////////
