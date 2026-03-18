////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     program94.java
//  Description :   Display array on screen using iteration 
//  Input :         Integer 
//  Output :        Integer
//  Author :        Varad Nitin Muley
//  Date :          07/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
  public void Display (int Brr[])
  {
    int i = 0 ;

    for(i = 0 ; i < Brr.length ; i++)
        {
          System.out.println(Brr[i]);
        }
  }
} //End Of ArrayX


// Entry point function 
public class program94
{
    public static void main (String A[])
    {
        int Arr [] = {10,20,30,40};

       ArrayX aobj = new ArrayX();

       aobj.Display(Arr);

    }
}//End of main 
