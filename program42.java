////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program42.java
//  Description :   Displays even numbers from 1 to the user-entered limit
//                  using conditional checking inside a loop.
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
import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :       Program42
//  Description :      Contains main function and Display method
//
/////////////////////////////////////////////////////////////////

class Program42
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Prints even numbers from 1 to iNo using % operator
    //  Input :         Integer
    //  Output :        void
    //
    /////////////////////////////////////////////////////////////////

    public static void Display(int iNo)
    {
        int iCnt = 0;                       // Loop counter

        // This loop checks each number and prints only if it is even.
        // Use this method when increment is not constant (refer Program40 for shorthand logic).
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0)             // Condition to check even number
            {
                System.out.print(iCnt + "\t"); // Print even number
            }
        }
    }

    // Time Complexity : O(N)

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Display(iValue);                    // Function call
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10
//  Output : 2   4   6   8   10
//
//  Input : 7
//  Output : 2   4   6
//
//  Input : 1
//  Output : (no output)
//
//  Input : 2
//  Output : 2
//
/////////////////////////////////////////////////////////////////
