////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program177.java
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         6
//  Output :        
//       
////////////////////////////////////////////////////////////////////////////////////////////////

/*
  input :   8
  Output :  z y x w v u t s 
  Index :   1 2 3 4 5 6 7 8 

        
*/


/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////
import java.util.*;


class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'z';
 
        for (iCnt = 1 ; iCnt <= iNo ; iCnt++,ch--)
        { 
            {
                System.out.printf("%c\t",ch);
            }
        }
        System.out.println(); 
    }
}

class program178
{
    public static void main (String A[])
    {
        Pattern pobj = new Pattern();

        Scanner sobj = new Scanner (System.in);

        int iValue = 0 ;

        System.out.println("Enter the Frequency: ");
        iValue = sobj.nextInt();

        pobj.Display(iValue);

    }
}