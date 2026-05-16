import java.io.*;

class Program199
{
    public static void main(String[] args)
    {
        File obj = new File("PPA.txt");

        if(obj.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Unable to delete the file");
        }
    }
}
