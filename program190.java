////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program186.java
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         6
//  Output :        
//       
////////////////////////////////////////////////////////////////////////////////////////////////

/*
    iRow = 4    iCol = 4

       # # # # 
       * # # # 
       * * # #
       * * * # 
       

       
        
*/


/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////
import java.util.*;


class Pattern
{
    //Filter for Square pattern
    public void Display(int iRow,int iCol)
    {
        int i = 0 ,j = 0;
 
        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and column number should be same");
            return;
        }
        for (i = 1 ; i <= iRow ; i++)
        {
            
            for (j = 1 ; j <= iCol ; j++)
            {
                if(i > j)
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("#\t");
                }

            }
            System.out.println();
        }
       
        System.out.println(); 
    }
}

class program190
{
    public static void main (String A[])
    {
        Pattern pobj = new Pattern();

        Scanner sobj = new Scanner (System.in);

        int iValue1 = 0 ,iValue2 = 0 ;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        pobj.Display(iValue1,iValue2);

    }
}