////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program45.java
//  Description :   Displays the factors of number 6 using multiple
//                  conditional checks inside a function.
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

/////////////////////////////////////////////////////////////////
//
//  Class Name :       Program45
//  Description :      Contains main function and DisplayFactors method
//
/////////////////////////////////////////////////////////////////

class Program45
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description :   Prints all factors of 6 using conditional checks
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayFactors()
    {
        // Checking divisibility for each number manually
        if((6 % 1) == 0)
        {
            System.out.println("1");
        }
        if((6 % 2) == 0)
        {
            System.out.println("2");
        }
        if((6 % 3) == 0)
        {
            System.out.println("3");
        }
        if((6 % 4) == 0)
        {
            System.out.println("4");
        }
        if((6 % 5) == 0)
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
        DisplayFactors();                  // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Output :
//  1
//  2
//  3
//  (Since 4 and 5 are not factors of 6, they are not printed)
//
/////////////////////////////////////////////////////////////////
