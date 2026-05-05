////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program7.java
//  Description :   Accepts two integers from the user and returns their
//                  addition using a user-defined function.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Function Name :    AdditionTwoNumbers
//  Description :      Performs addition of two integers and returns
//                     the result.
//
/////////////////////////////////////////////////////////////////

class program7
{
    public static int AdditionTwoNumbers(int iNo1, int iNo2)
    {
        int sum = 0;                // Variable to store the sum
        sum = iNo1 + iNo2;          // Business logic
        return sum;                 // Return the result
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    { 
        int iValue1 = 0, iValue2 = 0;   // Variables to store user input
        int iRet = 0;                   // Variable to store result

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();                 // Accept first number

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();                 // Accept second number

        iRet = AdditionTwoNumbers(iValue1, iValue2);   // Call user-defined function

        System.out.println("Addition is : " + iRet);      // Display output
        
    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 5   10
//  Output : Addition is : 15
//
//  Testcase 2:
//  Input  : -10   20
//  Output : Addition is : 10
//
//  Testcase 3:
//  Input  : 0   0
//  Output : Addition is : 0
//
/////////////////////////////////////////////////////////////////
