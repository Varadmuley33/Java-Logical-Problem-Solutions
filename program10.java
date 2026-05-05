////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program10.java
//  Description :   Application which accepts two floating point numbers,
//                  converts negative values into positive and performs
//                  their addition.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Problem Solving Steps
//
/////////////////////////////////////////////////////////////////
/*
    Step 1 : Understand the problem statement
    Step 2 : Write the algorithm
    Step 3 : Decide the programming language
    Step 4 : Write the program
    Step 5 : Test the program
*/

/////////////////////////////////////////////////////////////////
//
//  Algorithm
//
/////////////////////////////////////////////////////////////////
/*
    START
        Accept first number as No1
        Accept second number as No2
        If input is negative convert into positive
        Perform addition of No1 and No2
        Display result on screen
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Function Name :    AdditionTwoNumbers
//  Description   :    Converts negative values into positive
//                     and returns their addition.
//
/////////////////////////////////////////////////////////////////

class program10
{
    public static float AdditionTwoNumbers(float fNo1, float fNo2)
    {
        if(fNo1 < 0.0f)
        {
            fNo1 = -fNo1;      // Convert negative to positive
        }

        if(fNo2 < 0.0f)
        {
            fNo2 = -fNo2;      // Convert negative to positive
        }

        float fSum = fNo1 + fNo2;   // Perform addition
        return fSum;                // Return result
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        float fValue1 = 0.0f, fValue2 = 0.0f;   // Variables for user input
        float fRet = 0.0f;                      // Variable to store result

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        fValue2 = sobj.nextFloat();

        fRet = AdditionTwoNumbers(fValue1, fValue2);    // Call the user-defined function

        System.out.println("Addition is : " + fRet);       // Display result

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : -10.5    3.2
//  Output : Addition is : 13.7
//
//  Testcase 2:
//  Input  : 5.5    4.5
//  Output : Addition is : 10
//
//  Testcase 3:
//  Input  : -7.0    -3.0
//  Output : Addition is : 10
//
/////////////////////////////////////////////////////////////////
