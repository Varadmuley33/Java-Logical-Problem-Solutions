import java.io.*;

class Program196
{
    public static void main(String[] args)
    {
        File obj = new File("PPA.txt");

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
