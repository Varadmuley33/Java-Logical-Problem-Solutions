////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program61.java
//  Description :   Demonstrates digit extraction of a fixed number (7236)
//                  while displaying both the extracted digit and the
//                  updated remaining number after each step.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

class Program61
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iNo = 7236;                 // Predefined number
        int iDigit = 0;                 // To store extracted digit

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : None (Static value = 7236)
//  Output : Shows digit extraction and remaining number step-by-step
//
/////////////////////////////////////////////////////////////////
