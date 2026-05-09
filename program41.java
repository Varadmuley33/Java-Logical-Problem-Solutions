////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program41.java
//  Description :   Displays numbers from 1 up to the user-entered value
//                  using a simple for loop in Java.
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
//  Class Name :       Program41
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program41
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Prints numbers from 1 to iNo
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                       // Loop counter

        for(iCnt = 1; iCnt <= iNo; iCnt++) // Loop from 1 to iNo
        {
            System.out.print(iCnt + "\t"); // Print current number
        }
    }

    // Time Complexity : O(N)

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
//  Testcases successfully handled by the application
//
//  Input : 5
//  Output : 1   2   3   4   5
//
//  Input : 3
//  Output : 1   2   3
//
//  Input : 1
//  Output : 1
//
/////////////////////////////////////////////////////////////////
