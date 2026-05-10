////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program60.java
//  Description :   Extracts and displays each digit of a fixed four-digit
//                  number (7236) one by one using modulus and division.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
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
//  Class Name :       Program60
//  Description :      Contains main function for digit extraction
//
/////////////////////////////////////////////////////////////////

class Program60
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo = 7236;           // Predefined number
        int iDigit = 0;           // To store individual digits

        iDigit = iNo % 10;        // Extract last digit
        System.out.print(iDigit);
        iNo = iNo / 10;           // Remove last digit

        iDigit = iNo % 10;        // Next digit
        System.out.print(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.print(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.print(iDigit);
        iNo = iNo / 10;
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Output : 6327   (Digits printed in reverse order)
//
/////////////////////////////////////////////////////////////////
