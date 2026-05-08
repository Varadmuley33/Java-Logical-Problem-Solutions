////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program37.java
//  Description :   Displays numbers from 1 to user-entered frequency
//                  using a for loop inside a function in Java.
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
//  Class Name :       Program37
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program37
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name :    Display
    //  Description   :    Prints numbers from 1 to iNo using a loop
    //  Input         :    Integer
    //  Output        :    void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                      // Loop counter

        for(iCnt = 1; iCnt <= iNo; iCnt++) // Loop till input number
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
//  Output : 1   2   3   4   5
//
//  Input : 7
//  Output : 1   2   3   4   5   6   7
//
//  Input : 1
//  Output : 1
//
/////////////////////////////////////////////////////////////////
