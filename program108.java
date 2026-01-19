
////////////////////////////////////////////////////////////
//
//  File name :     program108.java
//  Description :   To return sum of elements of array 
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
    private int Arr[];
    private int iSize;                           //Characteristics

    public ArrayX(int iNo)
    {
        System.out.println("Inside Constructor");
        iSize = iNo;
        Arr = new int[iSize];                   //allocated resource
        
    }
    public void Accept()                        //To take input
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

    }
    public void Display()                       //To Display Output
    {
        System.out.println("Elements of the array are:");
        int iCnt = 0;
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
    public float Average()
    {
        
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return (iSum/iSize);
    }
}//End of ArrayX class


////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class program108
{
    public static void main (String A[])
    {
        float fRet =0.0f;

        ArrayX aobj1 = new ArrayX(5);
        aobj1.Accept();
        aobj1.Display();

        fRet = aobj1.Average();
        System.out.println("Averege of elements is "+fRet);
        
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
