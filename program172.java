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
  Output : a b c d e 
        
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
        int i = 97;
 
        for (iCnt = 1 ; iCnt <= iNo ; iCnt++)
        { 
            System.out.printf("%d\t",i);
            i++;
        }
        System.out.println(); 
    }
}

class program172
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