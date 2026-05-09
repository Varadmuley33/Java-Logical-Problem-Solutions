////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program44.java
//  Description :   Checks whether the first number is completely divisible
//                  by the second number using a user-defined function.
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
//  Class Name :       Program44
//  Description :      Contains main function and CheckDivisible method
//
/////////////////////////////////////////////////////////////////

class Program44
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CheckDivisible
    //  Description :   Returns true if iNo1 is completely divisible by iNo2
    //  Input :         Integer, Integer
    //  Output :        Boolean
    //
    /////////////////////////////////////////////////////////////////

    public static boolean CheckDivisible(int iNo1, int iNo2)
    {
        if((iNo1 % iNo2) == 0)              // Divisibility check
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

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        System.out.print("Enter first Number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second Number : ");
        iValue2 = sobj.nextInt();

        bRet = CheckDivisible(iValue1, iValue2); // Function call

        if(bRet == true)
        {
            System.out.println("It is completely divisible");
        }
        else
        {
            System.out.println("It is not completely divisible");
        }
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 12   2
//  Output : It is completely divisible
//
//  Input  : 12   3
//  Output : It is completely divisible
//
//  Input  : 12   5
//  Output : It is not completely divisible
//
//  Input  : 12   12
//  Output : It is completely divisible
//
/////////////////////////////////////////////////////////////////
