////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program20.java
//  Description :   Demonstrates a simple program to find the maximum
//                  of two user-entered integers using a function.
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
//  Function Name :    Maximum
//  Description   :    Returns the larger number between two integers
//  Input         :    Integer, Integer
//  Output        :    Integer
//
/////////////////////////////////////////////////////////////////

class program20
{
    public static int Maximum(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)                  // Comparison logic
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();

        iRet = Maximum(iValue1, iValue2);    // Function call

        System.out.println("Largest number is : " + iRet);

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 10   20
//  Output : Largest number is : 20
//
//  Testcase 2:
//  Input  : -5   -2
//  Output : Largest number is : -2
//
//  Testcase 3:
//  Input  : 7   7
//  Output : Largest number is : 7
//
/////////////////////////////////////////////////////////////////
