////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program8.java
//  Description :   Accepts two floating point numbers from the user and
//                  performs their addition using a separate function.
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
//  Description   :    Performs addition of two float values and
//                     returns the result.
//
/////////////////////////////////////////////////////////////////

class program8
{
    public static float AdditionTwoNumbers(float fNo1, float fNo2)
    {
        float fSum = 0.0f;          // Variable to store sum
        fSum = fNo1 + fNo2;         // Business logic
        return fSum;                // Return the result
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    { 
        float fValue1 = 0.0f, fValue2 = 0.0f;   // Variables to store user input
        float fRet = 0.0f;                      // Variable to store result

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        fValue1 = sobj.nextFloat();                         // Accept first float input

        System.out.print("Enter second number : ");
        fValue2 = sobj.nextFloat();                         // Accept second float input

        fRet = AdditionTwoNumbers(fValue1, fValue2);   // Call user-defined function

        System.out.println("Addition is : " + fRet);      // Display result
        
    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 10.5   5.5
//  Output : Addition is : 16
//
//  Testcase 2:
//  Input  : -2.5   7.5
//  Output : Addition is : 5
//
//  Testcase 3:
//  Input  : 0.0   0.0
//  Output : Addition is : 0
//
/////////////////////////////////////////////////////////////////
