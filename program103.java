
////////////////////////////////////////////////////////////
//
//  File name :     program102.java
//  Description :   To return sum of elemts of array 
//  Author :        Pallavi Sable
//  Date :          7/11/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED HEADER FILES
//
////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////
//
//  Function Name : Summation
//  Description :   returns sum of elements of array
//  Intput :        int
//  Output :        int
//  Author :        Pallavi Sable
//  Date :          07/11/2025
//  Time Complexity:O(N)
//               
////////////////////////////////////////////////////////////

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];                   //allocated resources

    }
}


////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class program103
{
    public static void main (String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        ArrayX aobj2 = new ArrayX(7);
        ArrayX aobj3 = new ArrayX(3);
    }
}


//End of main

////////////////////////////////////////////////////////////
//
// Test cases succesfully handled by the application
// Input1 : 5       Output : 
// Input1 : 15      Output : false
// Input1 : -28     Output : true
// Input1 : 11      Output : false
// Input1 : 24      Output : false
//
////////////////////////////////////////////////////////////
