////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program17.java
//  Description :   Accepts an integer from user and checks whether
//                  the number is Even or Odd using direct boolean logic.
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
//  Description   :    Returns true if the given number is even,
//                     otherwise returns false.
//  Input         :    Integer
//  Output        :    Boolean
//  Author        :    Varad Nitin Muley
//  Date          :    16/10/2025
//
/////////////////////////////////////////////////////////////

class program17
{
    public static boolean CheckEvenOdd(int iNo)
    {
        return ((iNo % 2) == 0);
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
//  Input  : 20
//  Output : 20 is Even number
//
//  Testcase 2:
//  Input  : 11
//  Output : 11 is Odd number
//
//  Testcase 3:
//  Input  : 0
//  Output : 0 is Even number
//
/////////////////////////////////////////////////////////////////
