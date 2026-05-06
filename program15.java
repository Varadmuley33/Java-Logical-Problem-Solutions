////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program15.java
//  Description :   Accepts an integer from user and displays whether
//                  the number is Even or Odd using a boolean function.
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
//  Description   :    Checks whether the given integer is even.
//  Input         :    Integer
//  Output        :    Boolean (true if even, false if odd)
//  Author        :    Varad Nitin Muley
//  Date          :    16/10/2025
//
/////////////////////////////////////////////////////////////////

class program15
{
    public static boolean CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
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
//  Input  : 18
//  Output : 18 is Even number
//
//  Testcase 2:
//  Input  : 7
//  Output : 7 is Odd number
//
//  Testcase 3:
//  Input  : 0
//  Output : 0 is Even number
//
/////////////////////////////////////////////////////////////////
