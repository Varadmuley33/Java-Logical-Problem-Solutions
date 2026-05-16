import java.io.*;
import java.util.*;

class Program200
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String FileName;

        System.out.print("Enter the name of file that you want to create : ");
        FileName = sobj.nextLine();

        File obj = new File(FileName);

        try
        {
            if(obj.createNewFile())
            {
                System.out.println("File successfully created");
            }
            else
            {
                System.out.println("Unable to create the file");
            }
        }
        catch(Exception obj1)
        {
            System.out.println("Unable to create the file");
        }
    }
}
