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
    void test(int n)throws Exception 
    {
        int z= n/0;    
        
        
        // finally
        // {
        //     System.out.println("My Exception has been tested.");
        // }
        System.out.println("The entered number "+n+" is valid");
    }
    public static void main(String[]args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        B ob = new B();
        try 
        {
            ob.test(n);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}