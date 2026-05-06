////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program14.java
//  Description :   Accepts an integer from user and returns TRUE if
//                  the number is even, otherwise returns FALSE.
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
//  Function Name :    CheckEvenOdd
//  Description   :    Checks whether the given integer number is even.
//  Input         :    Integer
//  Output        :    Boolean (true if even, false if odd)
//  Author        :    Varad Nitin Muley
//  Date          :    16/10/2025
//
/////////////////////////////////////////////////////////////////

class program14
{
    public static boolean CheckEvenOdd(int iNo)
    {
        int iRem = 0;

        iRem = iNo % 2;

        if(iRem == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter your number : ");
        iValue = sobj.nextInt();

        bRet = CheckEvenOdd(iValue);

        System.out.println("Result is : " + bRet);

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 12
//  Output : Result is : 1
//
//  Testcase 2:
//  Input  : 9
//  Output : Result is : 0
//
//  Testcase 3:
//  Input  : 0
//  Output : Result is : 1
//
/////////////////////////////////////////////////////////////////
