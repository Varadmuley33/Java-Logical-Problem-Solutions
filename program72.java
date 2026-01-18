/////////////////////////////////////////////////////////////////
//
//  Class Name : program72
//  Description : It is used to display factors of a number (up to iNo/2)
//  Author :      Varad Nitin Muley
//  Date :        09/10/2025
//
/////////////////////////////////////////////////////////////////

public class program72
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo = 12;                               // Fixed input number
        int i = 0;                                 // Loop counter

        for(i = 1; i <= (iNo/2); i++)              // Loop from 1 to half of iNo
        {
            if((iNo % i) == 0)                     // Check factor condition
            {
                System.out.println(i);             // Print factor
            }
        }
    }   // End of main
}   // End of program72

/////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handaled by the application
//
//  Input  : 12     Output : 1 2 3 4 6
//  Input  : 10     Output : 1 2 5
//  Input  : 15     Output : 1 3 5
//
/////////////////////////////////////////////////////////////////

