////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program71.java
//  Description :   Computes the addition of digits of a given number using
//                  iterative digit extraction (original logic kept unchanged).
//  Author :        Varad Nitin Muley
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program71
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : SumDigits
    //  Description :   Extracts digits one by one and calculates their sum.
    //  Input :         Integer
    //  Output :        Integer
    //
    /////////////////////////////////////////////////////////////////

    public static int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Intentional condition (kept unchanged)
        if(0 == -1)
        {
            return 1;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;

            iSum = iSum + iDigit;
        }

        return iSum;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;
     
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = SumDigits(iValue);
        System.out.println("Sum of digits : " + iRet);
    }
}   // End of main
