////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program67.java
//  Description :   Displays each digit of the given number using iterative
//                  division and modulus operations.
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

class Program67
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayDigits
    //  Description :   Extracts and displays digits of the number
    //                  one by one using iteration.
    //  Input :         Integer
    //  Output :        None
    //
    /////////////////////////////////////////////////////////////////

    public static void DisplayDigits(int iNo)
    {
        int iDigit = 0;             // To store extracted digit

        System.out.println("-----------------------------------------------------");
        System.out.println("Original value of iNo is : " + iNo);

        // Iterate until all digits are processed
        while(iNo != 0)
        {
            System.out.println("-----------------------------------------------------");

            iDigit = iNo % 10;      // Extract last digit
            System.out.println("iDigit is : " + iDigit);

            iNo = iNo / 10;         // Remove last digit
            System.out.println("iNo is : " + iNo);
        }

        System.out.println("-----------------------------------------------------");
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        DisplayDigits(iValue);      // Function call
    }
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Note : This program demonstrates digit extraction using
//         iteration. Each step prints intermediate results.
//
//  Time Complexity : O(N)   (N = number of digits)
//
/////////////////////////////////////////////////////////////////
