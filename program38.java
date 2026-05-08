////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program38.java
//  Description :   Displays numbers in reverse order starting from the
//                  user-entered value down to 1 using a for loop.
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
//  Class Name :       Program38
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program38
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name :    Display
    //  Description   :    Prints numbers from iNo down to 1 in reverse order
    //  Input         :    Integer
    //  Output        :    void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                      // Loop counter

        for(iCnt = iNo; iCnt >= 1; iCnt--) // Reverse loop
        {
            System.out.print(iCnt + "\t"); // Print current number
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

        Display(iValue);                   // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Input : 5
//  Output : 5   4   3   2   1
//
//  Input : 3
//  Output : 3   2   1
//
//  Input : 1
//  Output : 1
//
/////////////////////////////////////////////////////////////////
