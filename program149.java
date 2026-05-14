////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Program149.java
//  Description :   Swaps two integer values using array reference
//                  simulation of pointer behavior.
//  Author :        Varad Nitin Muley
//  Date :          14/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

class Program149
{
    public static void Swap(int p[], int q[])
    {
        int Temp = 0;

        Temp = p[0];
        p[0] = q[0];
        q[0] = Temp;
    }

    public static void main(String A[])
    {
        int iValue1[] = {11};
        int iValue2[] = {21};

        System.out.println("Before swap " + iValue1[0] + " " + iValue2[0]);

        Swap(iValue1, iValue2);

        System.out.println("After swap " + iValue1[0] + " " + iValue2[0]);
    }
}
