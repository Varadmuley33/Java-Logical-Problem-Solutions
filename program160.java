////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program153.c
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         5 
//  Output :        1 2 3 4 5 
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
        for(iCnt = -iNo ; iCnt <= 0 ; iCnt ++)
        {
            System.out.print(iCnt+"\t");
        }

        for(iCnt = 1 ; iCnt <= iNo ; iCnt ++)
        {
            System.out.print(iCnt+"\t");
        }
        
        System.out.println();


    }
}

class program160
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