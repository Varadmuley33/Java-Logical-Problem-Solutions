////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program51.java
//  Description :   Extracts digits of a predefined number one by one
//                  using modulus and division operations.
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
//  Class Name :       Program51
//  Description :      Contains main function for digit extraction
//
/////////////////////////////////////////////////////////////////

class Program51
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo = 7236;             // Predefined number
        int iDigit = 0;             // To store extracted digit

        iDigit = iNo % 10;          // Extract last digit
        System.out.println(iDigit);
        iNo = iNo / 10;             // Remove last digit

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : None (Static value = 7236)
//  Output : 6
//           3
//           2
//           7
//
/////////////////////////////////////////////////////////////////
