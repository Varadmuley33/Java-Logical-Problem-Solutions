////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program43.java
//  Description :   Checks whether the first number is completely divisible
//                  by the second number using modulus operator.
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
//  Class Name :       Program43
//  Description :      Contains main function for divisibility checking
//
/////////////////////////////////////////////////////////////////

class Program43
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.print("Enter first Number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second Number : ");
        iValue2 = sobj.nextInt();

        if((iValue1 % iValue2) == 0)            // Check divisibility
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
//  Input : 12   2
//  Output : It is completely divisible
//
//  Input : 12   3
//  Output : It is completely divisible
//
//  Input : 12   5
//  Output : It is not completely divisible
//
//  Input : 12   12
//  Output : It is completely divisible
//
/////////////////////////////////////////////////////////////////
