////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program65.java
//  Description :   Demonstrates the use of iteration to extract digits from a
//                  number (723614) using modulo and division inside a loop.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

class Program65
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iNo = 723614;                // Input number
        int iDigit = 0;                  // Extracted digit

        System.out.println("-----------------------------------------------------");
        System.out.println("Original value of iNo is : " + iNo);

        // Loop continues until the number becomes 0
        while(iNo != 0)
        {
            System.out.println("-----------------------------------------------------");

            iDigit = iNo % 10;           // Extract last digit
            System.out.println("iDigit is : " + iDigit);

            iNo = iNo / 10;              // Remove last digit
            System.out.println("iNo is : " + iNo);
        }

        System.out.println("-----------------------------------------------------");
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Note :
//
//  This program shows how iteration (looping) simplifies repeated
//  operations, unlike manually writing multiple repeated steps.
//
//  Time Complexity : O(N) where N = number of digits.
//
/////////////////////////////////////////////////////////////////
