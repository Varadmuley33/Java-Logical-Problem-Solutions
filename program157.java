////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program157.c
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         6 
//  Output :        -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 
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
        for(iCnt = -iNo ; iCnt <= -1 ; iCnt ++)
        {
            System.out.print(iCnt+"\t");
        }

    }
}

class program157
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
