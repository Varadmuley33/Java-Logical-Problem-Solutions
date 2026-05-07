////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program26.java
//  Description :   Demonstrates dynamic function usage in Java by printing
//                  a message based on user-entered frequency.
//  Author :        Varad Nitin Muley
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class program26
{
/////////////////////////////////////////////////////////////////
//
//  Function Name :    Display
//  Description   :    Prints "Jay Ganesh..." iFrequency times
//  Input         :    Integer
//  Output        :    void
//
/////////////////////////////////////////////////////////////////

    public static void Display(int iFrequency)
    {
        int iCnt = 0;                                 // Loop counter

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.println("Jay Ganesh...");          // Repeated message
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

        Display(iCount);                               // Function call

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 3
//  Output : Jay Ganesh... (3 times)
//
//  Testcase 2:
//  Input  : 1
//  Output : Jay Ganesh... (1 time)
//
//  Testcase 3:
//  Input  : 0
//  Output : (No output)
//
//  Testcase 4:
//  Input  : 5
//  Output : Jay Ganesh... (5 times)
//
/////////////////////////////////////////////////////////////////
