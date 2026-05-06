////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program16.java
//  Description :   Accepts an integer from user and determines whether
//                  the number is Even or Odd using boolean logic.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////
//
// Required Header files
//
/////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////
//
//  Function Name :    CheckEvenOdd
//  Description   :    It is used to check whether the given number is
//                     even or odd and returns boolean result.
//  Input         :    Integer
//  Output        :    Boolean
//  Author        :    Varad Nitin Muley
//  Date          :    16/10/2025
//
/////////////////////////////////////////////////////////////

class program16
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

/////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//  
/////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        bRet = CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is Even number");
        }
        else
        {
            System.out.println(iValue + " is Odd number");
        }

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 24
//  Output : 24 is Even number
//
//  Testcase 2:
//  Input  : 13
//  Output : 13 is Odd number
//
//  Testcase 3:
//  Input  : 0
//  Output : 0 is Even number
//
/////////////////////////////////////////////////////////////////
