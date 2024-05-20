import java.util.*;
class CheckArguementException extends Exception
{
    public CheckArguementException(String str)
    {
        super(str);
    }
}
class Main
{
    public static void main(String[]args)// Integer.valueOf("15");
    {
        int n = args.length;
        try
        {
            if(n<5)
            {
                throw new CheckArguementException("Number of arguements is less than 5 hence exception is being handled.");
            }
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=Integer.valueOf(args[i]);
            }
            System.out.println("The sum of all the arguements is: "+sum);
        }
        catch(CheckArguementException e)
        {
            e.printStackTrace();
        }
        
    }
}