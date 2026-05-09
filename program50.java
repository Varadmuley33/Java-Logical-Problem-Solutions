////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program50.java
//  Description :   Displays all factors of a user-entered number using an
//                  optimized loop that runs only till iNo/2.
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
//  Class Name :       Program50
//  Description :      Contains main function and DisplayFactors method
//
/////////////////////////////////////////////////////////////////

class Program50
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description :   Optimized method to print factors by iterating
    //                  only up to (iNo / 2). Handles negative input.
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        // Updator
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Display all factors from 1 to iNo/2
        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)           // Factor condition
            {
                System.out.println(iCnt);
            }
        }
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Time Complexity : O(N/2)
    //
    /////////////////////////////////////////////////////////////////

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
//  Testcases successfully handled by the application
//
//  Input : 12
//  Output : 1  2  3  4  6
//
//  Input : 10
//  Output : 1  2  5
//
//  Input : -15
//  Output : 1  3  5
//
/////////////////////////////////////////////////////////////////
