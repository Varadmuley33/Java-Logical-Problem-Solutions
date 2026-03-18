////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program165.java
//  Description :   
//  Author :        Varad Nitin Muley
//  Date :          20/11/2025
//  Input :         6
//  Output :        
//       
////////////////////////////////////////////////////////////////////////////////////////////////

/*

        $ $ $ $  
        $ $ $ $
        $ $ $ $
        $ $ $ $
*/


/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////
import java.util.*;

class pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0 , j = 0 ;

        for(i = 1 ; i <= iRow ; i++)
        {
            for (j = 1 ; j <= iCol ; j++)
            {
                System.out.print("$\t");
            }
            System.out.println();
        }
    }
}

class program165
{
    public static void main (String A[])
    {
        pattern pobj = new pattern();

        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 ,iValue2 = 0;;
        

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        pobj.Display(iValue1,iValue2);
    }
}