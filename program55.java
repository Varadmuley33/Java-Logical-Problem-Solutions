////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program55.java
//  Description :   Optimized prime-checking program using early break
//                  to reduce unnecessary iterations.
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
//  Class Name :       Program55
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program55
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Checks whether the given number is prime.
    //  Input :         Integer
    //  Output :        Boolean (true/false)
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        if(iNo < 0)
        {
            iNo = -iNo;                     // Updator for negative input
        }

        for(iCnt = 2 ; iCnt <= (iNo / 2) ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iFrequency++;
                break;                      // Early exit for non-prime
            }
        }

        if(iFrequency == 0)                 // No divisor found
        {
            return true;
        }
        else                                // Divisor found
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
//  Input : 13
//  Output : 13 is a prime number
//
//  Input : 20
//  Output : 20 is not a prime number
//
//  Input : 1
//  Output : 1 is a prime number (based on this logic)
//
/////////////////////////////////////////////////////////////////

/*
    Time Complexity :
        - Prime number     : O(N/2)
        - Non-prime number : O(1) or O(2) due to early break
*/
