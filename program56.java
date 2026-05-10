////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program56.java
//  Description :   Optimized prime-checking program using an alternate
//                  approach where the loop index determines primality.
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
//  Class Name :       Program56
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program56
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Determines whether the number is prime using
    //                  loop-termination logic.
    //  Input :         Integer
    //  Output :        Boolean
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;                  // Updator for negative input
        }

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                break;                   // Factor found → stop early
            }
        }

        if(iCnt > (iNo / 2))             // Loop completed fully → prime
        {
            return true;
        }
        else                             // Loop broke early → not prime
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
//  Input : 17
//  Output : 17 is a prime number
//
//  Input : 15
//  Output : 15 is not a prime number
//
//  Input : 1
//  Output : 1 is a prime number (based on this approach)
//
/////////////////////////////////////////////////////////////////

/*
    Time Complexity:
        Prime Number     : O(N/2)
        Non-prime Number : O(1) or O(2) due to early break
*/
