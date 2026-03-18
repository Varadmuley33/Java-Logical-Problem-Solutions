////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program108.java
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
    }  // End of ArrayX class                                                                                           



    public void Display()
    {
        System.out.println("Elements of the array are ");
        int i = 0 ;

        for(i = 0 ; i < Arr.length ; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

//Entry point function
public class program107
{
    public static void main (String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        aobj1.Accept();
        aobj1.Display();

        ArrayX aobj2 = new ArrayX(7);
        aobj2.Accept();
        aobj2.Display();

    }
}// End of main 
