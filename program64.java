////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program64.java
//  Description :   Demonstrates the need for iteration by manually extracting
//                  each digit of a number (723614) using repeated modulo and
//                  division operations.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

class Program64
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iNo = 723614;                // Given number
        int iDigit = 0;                  // To extract each digit

        System.out.println("-----------------------------------------------------");
        System.out.println("Original value of iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract last digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract next digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract next digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract next digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract next digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        // Extract next digit
        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Note :
//
//  This program manually repeats the same logic multiple times.
//  It demonstrates *why loops are essential* in programming.
//
//  Without iteration → Code becomes long, repetitive, and error-prone.
//
/////////////////////////////////////////////////////////////////
