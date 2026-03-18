////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program152.c
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         5 
//  Output :        * * * * *
//
////////////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////
import java.util.*;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0 ;
        for(iCnt = 1 ; iCnt <= iNo ; iCnt ++)
        {
            System.out.print("*\t");
        }
        
        System.out.println();


    }
}

class program152
{
    public static void main (String A[])
    {
        pattern pobj = new pattern();

        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        pobj.Display(iValue);
    }
}