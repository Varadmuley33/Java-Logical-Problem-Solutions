class program113
{
    public static void Display(int ptr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            System.out.println(ptr[iCnt]);
        }
    }

    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};

        Display(Arr);
    }
}
