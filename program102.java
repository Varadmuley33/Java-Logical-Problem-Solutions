
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
    public void Display(int Brr[])
    {
        int iCnt = 0;
        System.out.println("Elements of array are");
        for(iCnt = 0; iCnt<Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            if((Brr[iCnt]% 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
    public int Summation(int Brr[])
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
        return iSum;
    }

}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class program102
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
            
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iRet = aobj.Summation(Arr);
        System.out.println("Sum of elements :" +iRet);
        

        aobj = null;
        Arr = null;
        sobj = null;

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
