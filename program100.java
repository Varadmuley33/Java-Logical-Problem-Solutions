////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program100.java
//  Description :   Take input from user
//  Author :        Varad Nitin Muley
//  Date :          07/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0 ;
        for(i = 0 ; i < Brr.length ; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}//End Of Arrayx


//Entry point function
public class program100
{
    public static void main (String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int i = 0 ;

        System.out.println("Enter the size of array : ");
        iSize = sobj.nextInt();

        int Arr [] = new int[iSize];

        System.out.println("Enter the elements : ");

        for ( i = 0 ; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

    }
}// End of main 
