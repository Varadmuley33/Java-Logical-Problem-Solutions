////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program97.java
//  Description :   Create another function to write logic
//  Author :        Varad Nitin Muley
//  Date :          07/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0 ;
        for(i = 0 ; i < Brr.length ; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}//End Of Arrayx


//Entry point function
public class program97
{
    public static void main (String A[])
    {
        int Arr [] = new int[4];

        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

    }
}// End of main 
