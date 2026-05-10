////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program58.java
//  Description :   Prime number checking using flag initialization
//                  outside and updation before loop.
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
//  Class Name :       Program58
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program58
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Returns true if number is prime, false otherwise
    //  Input :         Integer
    //  Output :        Boolean
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;             // Changed initialization (as you wrote)

        if(iNo < 0)
        {
            iNo = -iNo;                    // Updator for negative input
        }

        bFlag = true;                      // Mark as prime initially

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;             // Factor found → not prime
                break;                     // Optimization
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
//  Input : 19
//  Output : 19 is a prime number
//
//  Input : 20
//  Output : 20 is not a prime number
//
//  Input : 2
//  Output : 2 is a prime number
//
/////////////////////////////////////////////////////////////////

/*
    Time Complexity:
        Prime number     : O(N/2)
        Non-prime number : O(1) or O(2)
*/
