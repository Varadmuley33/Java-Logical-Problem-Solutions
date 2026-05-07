////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program23.java
//  Description :   Demonstrates how to reverse a user-entered integer
//                  using a loop and modulo operation in Java.
//  Author :        Varad Nitin Muley
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files     
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class program23
{
/////////////////////////////////////////////////////////////////
//
//  Function Name :    Reverse
//  Description   :    Returns the reverse of a given integer
//  Input         :    Integer
//  Output        :    Integer
//
/////////////////////////////////////////////////////////////////

    public static int Reverse(int iNo)   
    {
        int iDigit = 0, iRev = 0;

        if(iNo < 0)
        {
            iNo = -iNo;                     // Updator for negative numbers
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;              // Extract last digit
            iRev = (iRev * 10) + iDigit;    // Build reverse number
            iNo = iNo / 10;                 // Remove last digit
        }

        return iRev;
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        iRet = Reverse(iValue);             // Function call

        System.out.println("Reverse number is : " + iRet);

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 7531
//  Output : Reverse number is : 1357
//
//  Testcase 2:
//  Input  : -980
//  Output : Reverse number is : 89
//
//  Testcase 3:
//  Input  : 5
//  Output : Reverse number is : 5
//
/////////////////////////////////////////////////////////////////
