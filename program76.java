/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.io.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name  : program76
//  Description : It is used to display factors of a given number using BufferedReader with throws keyword
//  Author      : Varad Nitin Muley
//  Date        : 09/10/2025
//
/////////////////////////////////////////////////////////////////

public class program76
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    // Not a good programming of writing throws infront of main
    public static void main(String A[]) throws IOException
    {
        int iNo = 0;                                            // To accept user input
        int i = 0;                                              // Loop counter

        BufferedReader bobj = new BufferedReader(
                                new InputStreamReader(System.in)); // BufferedReader object

        System.out.println("Enter number : ");

        iNo = Integer.parseInt(bobj.readLine());                // Accept number

        for(i = 1; i <= (iNo/2); i++)                           // Loop from 1 to half of iNo
        {
            if((iNo % i) == 0)                                  // Check factor condition
            {
                System.out.println(i);                          // Print factor
            }
        }
    }   // End of main
}   // End of program76

/////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handaled by the application
//
//  Input  : 12     Output : 1 2 3 4 6
//  Input  : 10     Output : 1 2 5
//  Input  : 15     Output : 1 3 5
//
/////////////////////////////////////////////////////////////////
