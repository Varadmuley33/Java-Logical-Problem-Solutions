////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program62.java
//  Description :   Demonstrates digit extraction of a fixed number (7236)
//                  and displays the intermediate value after each step
//                  with clear separators for readability.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

class Program62
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iNo = 7236;                   // Predefined number
        int iDigit = 0;                   // To store extracted digits

        System.out.println("-----------------------------------------------------");
        System.out.println("Original value of iNo is : " + iNo);
        System.out.println("-----------------------------------------------------");

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        System.out.println("-----------------------------------------------------");

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        System.out.println("-----------------------------------------------------");

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        System.out.println("-----------------------------------------------------");

        iDigit = iNo % 10;
        System.out.println("iDigit is : " + iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : " + iNo);

        System.out.println("-----------------------------------------------------");
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : None (Static value = 7236)
//  Output : Shows digit extraction process with separators
//
/////////////////////////////////////////////////////////////////
