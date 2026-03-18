////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program103.java
//  Description :   Design the class using OOP design
//  Author :        Varad Nitin Muley
//  Date :          07/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int no)
    {
        iSize = no ; 
        Arr = new int[iSize];
    }
}

//Entry point function
public class program103
{
    public static void main (String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        ArrayX aobj2 = new ArrayX(7);
        ArrayX aobj3 = new ArrayX(3);

 
    }
}// End of main 
