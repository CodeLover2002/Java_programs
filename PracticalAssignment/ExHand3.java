import java.util.*;
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class B 
{
    public static void main(String[]args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        try
        {
            if(n<10)
                throw new MyException("The entered number is invalid");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("My Exception has been tested.");
        }
    }
}