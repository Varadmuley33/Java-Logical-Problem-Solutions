////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program39.java
//  Description :   Displays numbers in reverse order from the user-
//                  entered value down to 0 using a for loop.
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
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
//  Class Name :       Program39
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program39
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name :    Display
    //  Description   :    Prints numbers from iNo down to 0
    //  Input         :    Integer
    //  Output        :    void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                       // Loop counter

        for(iCnt = iNo; iCnt >= 0; iCnt--)  // Reverse loop including 0
        {
            System.out.print(iCnt + "\t"); // Print number
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

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Display(iValue);                    // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Input : 5
//  Output : 5   4   3   2   1   0
//
//  Input : 3
//  Output : 3   2   1   0
//
//  Input : 0
//  Output : 0
//
/////////////////////////////////////////////////////////////////
