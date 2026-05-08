////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program40.java
//  Description :   Displays even numbers from 2 up to the user-entered
//                  value using a step-by-2 for loop.
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
//  Class Name :       Program40
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program40
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name :    Display
    //  Description   :    Prints even numbers from 2 to iNo
    //  Input         :    Integer
    //  Output        :    void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                       // Loop counter

        for(iCnt = 2; iCnt <= iNo; iCnt = iCnt + 2)
        {
            System.out.print(iCnt + "\t"); // Print even number
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
//  Input : 10
//  Output : 2   4   6   8   10
//
//  Input : 7
//  Output : 2   4   6
//
//  Input : 2
//  Output : 2
//
/////////////////////////////////////////////////////////////////
