////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program46.java
//  Description :   Demonstrates the wrong approach to display factors of
//                  a number by manually checking each possible divisor.
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
//  Class Name :       Program46
//  Description :      Contains main function and DisplayFactors method
//
/////////////////////////////////////////////////////////////////

class Program46
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description :   Prints factors of iNo using multiple if conditions
    //                  (Not an efficient approach)
    //
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayFactors(int iNo)
    {
        // Checking divisibility manually (wrong approach)
        if((iNo % 1) == 0)
        {
            System.out.println("1");
        }
        if((iNo % 2) == 0)
        {
            System.out.println("2");
        }
        if((iNo % 3) == 0)
        {
            System.out.println("3");
        }
        if((iNo % 4) == 0)
        {
            System.out.println("4");
        }
        if((iNo % 5) == 0)
        {
            System.out.println("5");
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

        DisplayFactors(iValue);            // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6
//  Output : 1  2  3  (4 and 5 are skipped because they are not factors)
//
//  Input : 10
//  Output : 1  2  5
//
//  Input : 12
//  Output : 1  2  3  4
//
/////////////////////////////////////////////////////////////////
