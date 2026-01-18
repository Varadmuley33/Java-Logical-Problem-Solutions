/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name  : Number
//  Description : It is used to check whether the given number is perfect or not
//  Author      : Varad Nitin Muley
//  Date        : 09/10/2025
//
/////////////////////////////////////////////////////////////////

class Number
{
    int i = 0;                                                // Loop counter
    int iSum = 0;                                             // To store summation of factors

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CheckPerfect
    //  Description   : It is used to check whether number is perfect or not
    //  Input         : Integer
    //  Output        : Boolean
    //  Author        : Varad Nitin Muley
    //  Date          : 09/10/2025
    //
    /////////////////////////////////////////////////////////////////

    public boolean CheckPerfect(int iNo)
    {
        for(i = 1; i <= (iNo/2); i++)                         // Loop from 1 to half of iNo
        {
            if((iNo % i) == 0)                                // Check factor condition
            {
                iSum = iSum + i;                              // Summation of factors
            }
        }

        if(iSum == iNo)                                       // Perfect number condition
        {
            return true;
        }
        else
        {
            return false;
        }
    }   // End of CheckPerfect
}   // End of Number

/////////////////////////////////////////////////////////////////
//
//  Class Name  : program80
//  Description : It is used to accept number from user and check whether it is perfect number or not
//  Author      : Varad Nitin Muley
//  Date        : 09/10/2025
//
/////////////////////////////////////////////////////////////////

public class program80
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);                // Scanner object

        int iValue = 0;                                       // To accept user input
        boolean bRet = false;                                 // To store the result

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();                           // Object creation

        bRet = nobj.CheckPerfect(iValue);                     // Method call

        if(bRet == true)
        {
            System.out.println(iValue + " is perfect number ");
        }
        else
        {
            System.out.println(iValue + " is not a perfect number ");
        }

        // Important
        sobj = null;
        nobj = null;

        System.gc();                                          // Call for Garbage Collection
    }   // End of main
}   // End of program80

/////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handaled by the application
//
//  Input  : 6      Output : 6 is perfect number
//  Input  : 28     Output : 28 is perfect number
//  Input  : 12     Output : 12 is not a perfect number
//
/////////////////////////////////////////////////////////////////
