////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program59.java
//  Description :   Prime number checking by initializing the flag
//                  inside the for loop initialiser section.
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
//  Class Name :       Program59
//  Description :      Contains main function and checkPrime method
//
/////////////////////////////////////////////////////////////////

class Program59
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : checkPrime
    //  Description :   Returns true if number is prime, otherwise false.
    //  Input :         Integer
    //  Output :        Boolean
    //
    /////////////////////////////////////////////////////////////////

    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;             // Initial value (changed as per logic)

        if(iNo < 0)
        {
            iNo = -iNo;                    // Updator for negative input
        }

        // Initialize iCnt and bFlag inside loop initialiser
        for(iCnt = 2, bFlag = true; iCnt <= (iNo / 2); iCnt++)
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
//  Input : 23
//  Output : 23 is a prime number
//
//  Input : 28
//  Output : 28 is not a prime number
//
//  Input : 5
//  Output : 5 is a prime number
//
/////////////////////////////////////////////////////////////////

/*
    Time Complexity:
        Prime number     : O(N/2)
        Non-prime number : O(1) or O(2)
*/
