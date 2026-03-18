////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program172.java
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         6
//  Output :        
//       
////////////////////////////////////////////////////////////////////////////////////////////////

/*
  input : 5
  Output :  A B C D E 
  ASCII :   65 66 67 68 69  
        
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
        //int i = 97;
        char ch = 'A';
 
        for (iCnt = 1 ; iCnt <= iNo ; iCnt++,ch++)
        { 
            System.out.printf("%c\n",ch);
        }
        System.out.println(); 
    }
}

class program176
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