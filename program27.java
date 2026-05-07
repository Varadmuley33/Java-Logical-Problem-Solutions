////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program27.java
//  Description :   Demonstrates dynamic message printing with validation
//                  by accepting frequency from the user and applying a
//                  filter for negative input.
//  Author :        Varad Nitin Muley
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class program27
{
/////////////////////////////////////////////////////////////////
//
//  Function Name :    Display
//  Description   :    Prints "Jay Ganesh..." iFrequency times
//                     Handles negative input using filter logic
//  Input         :    Integer
//  Output        :    void
//
/////////////////////////////////////////////////////////////////

    public static void Display(int iFrequency)
    {
        int iCnt = 0;                                      // Loop counter

        // Filter for invalid input
        if(iFrequency < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.println("Jay Ganesh...");               // Repeated message
        }
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency : ");
        iCount = sobj.nextInt();

        Display(iCount);                                   // Function call

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 4
//  Output : Jay Ganesh... (4 times)
//
//  Testcase 2:
//  Input  : -3
//  Output : Invalid input
//
//  Testcase 3:
//  Input  : 0
//  Output : (No output)
//
//  Testcase 4:
//  Input  : 2
//  Output : Jay Ganesh... (2 times)
//
//
/////////////////////////////////////////////////////////////////
