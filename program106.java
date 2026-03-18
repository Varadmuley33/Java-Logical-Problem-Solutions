////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program106.java
//  Description :   Design the class using OOP design
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
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        System.out.println("Inside constructor");
        iSize = no ; 
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0 ;

        System.out.println("Enter the elements of Array : ");

        for(i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("elements of the array are ");
        int i = 0 ;

        for(i = 0 ; i < Arr.length ; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

//Entry point function
public class program106
{
    public static void main (String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        System.out.println(aobj1.iSize);              //Error

        // Bad code (Need of access specifier)
        aobj1.iSize = 11;                             //Error
        aobj1.Arr = null;                             //Error

        ArrayX aobj2 = new ArrayX(7);
        System.out.println(aobj2.iSize);              //Error

    }
}// End of main 
