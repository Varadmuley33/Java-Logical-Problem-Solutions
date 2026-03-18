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
  input : 8
  Output :  1 A 3 B 5 C 7 D 
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
        char ch = 'A';
 
        for (iCnt = 1 ; iCnt <= iNo ; iCnt++)
        { 
            if((iCnt % 2) == 0)
            {
                System.out.printf("%c\t",ch);
                ch++;
            }
            else
            {
                System.out.printf("%d\t",iCnt);
            }
        }
        System.out.println(); 
    }
}

class program177
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