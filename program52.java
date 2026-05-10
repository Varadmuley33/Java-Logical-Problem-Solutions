////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program52.java
//  Description :   Counts the total number of non-factors of a given number
//                  and displays the count as output.
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
//  Class Name :       Program52
//  Description :      Contains main function and CountNonFactors method
//
/////////////////////////////////////////////////////////////////

class Program52
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountNonFactors
    //  Description :   Returns count of all numbers that are NOT factors of iNo
    //  Input :         Integer
    //  Output :        Integer (Count)
    //
    /////////////////////////////////////////////////////////////////

    public static int CountNonFactors(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        if(iNo < 0)
        {
            iNo = -iNo;             // Updator for negative input
        }

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iFrequency++;       // Count non-factors
            }
        }

        return iFrequency;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = CountNonFactors(iValue);

        System.out.println("Number of Non-factors are : " + iRet);
    }
}   // End of class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6
//  Output : 3        (Non-factors : 4, 5, 3 is a factor)
//
//  Input : 10
//  Output : 6        (Non-factors : 3,4,6,7,8,9)
//
//  Input : 12
//  Output : 7        (Non-factors : 5,7,8,9,10,11,3? -> 3 is factor)
//
/////////////////////////////////////////////////////////////////
