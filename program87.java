// Factorial code 
// Input : 5 
// Output 1   *   2   *   3   *   4   *   5 = 120
import java.util.*;

class Number
{

    public int CalculateFactorial(int iNo)
    {
        int i = 0 ;
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(i = 1 ; i<= iNo ; i++)
        {
            iFact = iFact * i;
        }
        return iFact;

    }

}// End of number 


public class program87
{

    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int iValue = 0 ;
        int iRet = 0;

        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();


        iRet = nobj.CalculateFactorial(iValue); 
        System.out.println("Factorial is : " + iRet);

       

        // Important 
        sobj = null;
        nobj = null;

        System.gc();
    }
}
