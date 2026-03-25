class program115
{
    public static void Display(int Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};

        Display(Arr);
    }
}
