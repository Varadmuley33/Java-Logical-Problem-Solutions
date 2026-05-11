////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program66.java
//  Description :   Demonstrates digit extraction using iteration. The program
//                  accepts a number from the user and prints each digit along
//                  with the updated value of the number after removing digits.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program66
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;                     // Number entered by user
        int iDigit = 0;                  // Extracted digit

        System.out.print("Enter the number : ");
        iNo = sobj.nextInt();

        System.out.println("-----------------------------------------------------");
        System.out.println("Original value of iNo is : " + iNo);

        // Iteratively extract digits until the number becomes zero
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
//  This program demonstrates the need of iteration for repetitive
//  operations like digit extraction.
//
//  Time Complexity : O(N)   (N = number of digits)
//
/////////////////////////////////////////////////////////////////
