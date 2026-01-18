import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name : program73
//  Description : It is used to display factors of a given number (up to iNo/2)
//  Author :      Varad Nitin Muley
//  Date :        09/10/2025
//
/////////////////////////////////////////////////////////////////

public class program73
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);          // Scanner object for input

        int iNo = 0;                                    // To accept user input
        int i = 0;                                      // Loop counter

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        for(i = 1; i <= (iNo/2); i++)                   // Loop from 1 to half of iNo
        {
            if((iNo % i) == 0)                          // Check factor condition
            {
                System.out.println(i);                  // Print factor
            }
        }

        sobj.close();                                   // Closing Scanner
    }   // End of main
}   // End of program73

/////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handaled by the application
//
//  Input  : 12     Output : 1 2 3 4 6
//  Input  : 10     Output : 1 2 5
//  Input  : 15     Output : 1 3 5
//
/////////////////////////////////////////////////////////////////
