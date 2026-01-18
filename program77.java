/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name  : Number
//  Description : It is used to display factors of a given number
//  Author      : Varad Nitin Muley
//  Date        : 09/10/2025
//
/////////////////////////////////////////////////////////////////

class Number
{
    int i = 0;                                                // Loop counter

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFactors
    //  Description   : It is used to display factors of given number
    //  Input         : Integer
    //  Output        : Nothing
    //  Author        : Varad Nitin Muley
    //  Date          : 09/10/2025
    //
    /////////////////////////////////////////////////////////////////

    public void DisplayFactors(int iNo)
    {
        for(i = 1; i <= (iNo/2); i++)                         // Loop from 1 to half of iNo
        {
            if((iNo % i) == 0)                                // Check factor condition
            {
                System.out.println(i);                        // Print factor
            }
        }
    }   // End of DisplayFactors
}   // End of Number

/////////////////////////////////////////////////////////////////
//
//  Class Name  : program77
//  Description : It is used to accept number from user and display its factors using class
//  Author      : Varad Nitin Muley
//  Date        : 09/10/2025
//
/////////////////////////////////////////////////////////////////

public class program77
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

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();                           // Object creation

        nobj.DisplayFactors(iValue);                          // Method call

        sobj.close();                                         // Closing Scanner
    }   // End of main
}   // End of program77

/////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handaled by the application
//
//  Input  : 12     Output : 1 2 3 4 6
//  Input  : 10     Output : 1 2 5
//  Input  : 15     Output : 1 3 5
//
/////////////////////////////////////////////////////////////////
