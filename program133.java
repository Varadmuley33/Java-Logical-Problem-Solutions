////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program133.java
//  Description :   Accepts array elements from the user by dynamically
//                  creating an array and storing entered values.
//  Author :        Varad Nitin Muley
//  Date :          14/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program133
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0;
        int iPtr[];

        System.out.println("Enter the number of elements : ");
        iLength = sobj.nextInt();

        // Step 1 : Allocate the memory
        iPtr = new int[iLength];

        System.out.println("Enter the values : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iPtr[iCnt] = sobj.nextInt();
        }

        // Step 2 : Use the memory
        // Call to the function which contains business logic
        // Fun(iPtr , iLength);

        // Step 3 : Free the memory
        iPtr = null;

        sobj.close();
    }
}
