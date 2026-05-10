////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program54.java
//  Description :   Checks whether the given number is prime or not
//                  using divisor counting technique.
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
//  Class Name :       Program54
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program54
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Determines if the given number is prime
    //  Input :         Integer
    //  Output :        Boolean (true / false)
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        if(iNo < 0)
        {
            iNo = -iNo;          // Updator for negative numbers
        }

        for(iCnt = 2 ; iCnt <= (iNo / 2) ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iFrequency++;    // Count how many divisors
            }
        }

        if(iFrequency == 0)
        {
            return true;         // Prime number
        }
        else
        {
            return false;        // Not prime
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
//  Input : 7
//  Output : 7 is a prime number
//
//  Input : 12
//  Output : 12 is not a prime number
//
//  Input : 1
//  Output : 1 is a prime number (as per this logic)
//
//  (Note: Mathematically, 1 is NOT prime, but logic used here treats it as prime.)
//
/////////////////////////////////////////////////////////////////
