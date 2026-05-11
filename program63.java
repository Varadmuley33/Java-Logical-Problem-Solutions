////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program63.java
//  Description :   Extracts digits of a six-digit number (723614) step-by-step
//                  and displays each extracted digit along with updated value.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

class Program63
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iNo = 723614;                 // Predefined 6-digit number
        int iDigit = 0;                   // To store extracted digit

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

        // Continue if you want full digit extraction (but user gave only 4 steps)
        // iDigit = iNo % 10;
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : None (static number = 723614)
//  Output : Digit extraction with updated values printed step-by-step
//
/////////////////////////////////////////////////////////////////
