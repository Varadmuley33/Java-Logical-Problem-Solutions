////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program83.java
//  Description :   Accepts a number from the user and checks whether
//                  the given number is a Perfect Number or not.
//  Author :        Varad Nitin Muley
//  Date :          02/03/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Number
//  Description :   This class contains a method which checks
//                  whether the given number is a perfect number
//                  or not by calculating the sum of its factors.
//  Author :        Varad Nitin Muley
//  Date :          02/03/2026
//
/////////////////////////////////////////////////////////////////

class Number
{
    int i = 0; 
    int iSum = 0 ;

    public boolean CheckPerfect (int iNo)
    {
        if(iNo < 0 )
        {
            iNo = -iNo;
        }
        
        for(i = 1 ; i<=(iNo/2)  ; i++)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }

            if(iSum > iNo)
            {
                break;
            }
        }

        return (iSum == iNo);
    }

}// End of number 

/////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description :   Entry point of the application. It accepts
//                  a number from the user and checks whether
//                  the number is perfect or not using Number class.
//  Input :         Integer
//  Output :        Displays whether the number is perfect or not
//  Author :        Varad Nitin Muley
//  Date :          02/03/2026
//
/////////////////////////////////////////////////////////////////

public class program83
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int iValue = 0 ;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPerfect(iValue); 

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

        System.gc();
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6
//  Output : 6 is perfect number
//
//  Input : 10
//  Output : 10 is not a perfect number
//
//  Input : 28
//  Output : 28 is perfect number
//
/////////////////////////////////////////////////////////////////
