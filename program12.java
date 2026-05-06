////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program12.java
//  Description :   Accepts an integer from the user and checks whether
//                  the number is even or odd.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Algorithm
//
/////////////////////////////////////////////////////////////////
/*
    START
        Accept number and store it as No
        Divide No by 2
        If remainder is 0
            Display as Even
        Else
            Display as Odd
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Function Name :    CheckEvenOdd
//  Description   :    Checks whether the given integer is even or odd.
//  Input         :    Integer
//  Output        :    void
//  Author        :    Varad Nitin Muley
//  Date          :    16/10/2025
//
/////////////////////////////////////////////////////////////////

class program12
{
    public static void CheckEvenOdd(int iNo)
    {
        int iRem = 0;

        iRem = iNo % 2;

        if(iRem == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter your number : ");
        iValue = sobj.nextInt();

        CheckEvenOdd(iValue);

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 10
//  Output : Number is even
//
//  Testcase 2:
//  Input  : 7
//  Output : Number is odd
//
//  Testcase 3:
//  Input  : 0
//  Output : Number is even
//
/////////////////////////////////////////////////////////////////
