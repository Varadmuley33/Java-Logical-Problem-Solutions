////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program57.java
//  Description :   Checks whether a given number is prime using a
//                  boolean flag and early loop termination.
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
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
//  Class Name :       Program57
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program57
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Determines if the input number is prime using
    //                  a flag that flips on finding a divisor.
    //  Input :         Integer
    //  Output :        Boolean
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;               // Assume number is prime initially

        if(iNo < 0)
        {
            iNo = -iNo;                     // Updator for negative input
        }

        for(iCnt = 2 ; iCnt <= (iNo / 2) ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;              // Factor found → not prime
                break;                      // Optimization
            }
        }

        return bFlag;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        bRet = checkPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is a prime number");
        }
        else
        {
            System.out.println(iValue + " is not a prime number");
        }
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 29
//  Output : 29 is a prime number
//
//  Input : 21
//  Output : 21 is not a prime number
//
//  Input : 2
//  Output : 2 is a prime number
//
/////////////////////////////////////////////////////////////////

/*
    Time Complexity:
        Prime number     : O(N/2)
        Non-prime number : O(1) or O(2) due to early break
*/
