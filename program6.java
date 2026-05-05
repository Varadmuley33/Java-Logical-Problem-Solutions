////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program6.java
//  Description :   Accepts two integers from the user, performs addition
//                  using a user-defined function, and displays the result.
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
//  Function Name :     Add
//  Description   :     Performs addition of two integers
//
/////////////////////////////////////////////////////////////////

class program6
{
    public static int Add(int A, int B)
    {
        int sum = 0;
        sum = A + B;        // Business logic
        return sum;         // Return the result
    }

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        int i = 0, j = 0;   // Variables to store user inputs
        int ans = 0;        // Variable to store the result

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        i = sobj.nextInt();           // Accept first input

        System.out.print("Enter second number : ");
        j = sobj.nextInt();           // Accept second input

        ans = Add(i, j);    // Call user-defined function

        System.out.println("Addition is : " + ans);   // Display result

    }   // End of main
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Testcase 1:
//  Input  : 10  20
//  Output : Addition is : 30
//
//  Testcase 2:
//  Input  : -5  12
//  Output : Addition is : 7
//
//  Testcase 3:
//  Input  : 100  250
//  Output : Addition is : 350
//
/////////////////////////////////////////////////////////////////
