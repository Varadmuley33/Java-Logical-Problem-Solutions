////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program22.java
//  Description :   Demonstrates how to count the number of digits in a
//                  user-entered integer using looping logic.
//  Author :        Varad Nitin Muley
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files    
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class program22
{
/////////////////////////////////////////////////////////////////
//
//  Function Name :    CountDigits
//  Description   :    Returns the total number of digits in a number
//  Input         :    Integer
//  Output        :    Integer
//
/////////////////////////////////////////////////////////////////

    public static int CountDigits(int iNo)
    {
        int iCnt = 0;                       // Digit counter

        if(iNo < 0)
        {
            iNo = -iNo;                     // Updator for negative numbers
        }

        if(iNo == 0)
        {
            return 1;
        }

        while(iNo != 0)
        {
            iNo = iNo / 10;                 // Remove last digit
            iCnt++;                         // Count this digit
        }

        return iCnt;                        // Return final count
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        iRet = CountDigits(iValue);         // Function call

        System.out.println("Number of digits are : " + iRet);

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 751
//  Output : Number of digits are : 3
//
//  Testcase 2:
//  Input  : -12345
//  Output : Number of digits are : 5
//
//  Testcase 3:
//  Input  : 0
//  Output : Number of digits are : 1
//
/////////////////////////////////////////////////////////////////
