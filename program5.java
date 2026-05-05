////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program5.java
//  Description :   Accepts two integers from the user and performs
//                  addition, then displays the result.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
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
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

class program5
{
    public static void main(String args[])
    {
        int i = 0, j = 0;   // Variables to store user input
        int ans = 0;        // Variable to hold the result

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        i = sobj.nextInt();           // Accept first number from user

        System.out.print("Enter second number : ");
        j = sobj.nextInt();           // Accept second number from user

        ans = i + j;        // Business logic: Perform addition

        System.out.println("Addition is : " + ans);   // Display output

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 10  15
//  Output : Addition is : 25
//
//  Testcase 2:
//  Input  : -5  20
//  Output : Addition is : 15
//
//  Testcase 3:
//  Input  : 100  200
//  Output : Addition is : 300
//
/////////////////////////////////////////////////////////////////
