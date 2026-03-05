////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program72.java
//  Description :   Displays all factors of the given number by
//                  iterating only up to half of the number.
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
//  Function Name : main
//  Description :   Entry point of the application. It finds and
//                  displays all factors of the given number.
//  Input :         Integer
//  Output :        Displays factors of the number
//  Author :        Varad Nitin Muley
//  Date :          02/03/2026
//
/////////////////////////////////////////////////////////////////

public class program72 
{
    public static void main (String A[])
    {
        int iNo = 12;
        int i = 0 ; 

        for(i = 1 ; i<= (iNo/2) ; i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12
//  Output : 1 2 3 4 6
//
//  Input : 10
//  Output : 1 2 5
//
//  Input : 7
//  Output : 1
//
/////////////////////////////////////////////////////////////////
