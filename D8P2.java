import java.util.*;
class MyException extends Exception
{
    public MyException(String str)
    {    
        super(str);
    }
}
class Main
{
    public int method()
    {
        int count=0,x=100,y;
        try
        {
            for(int i=10;i>=0;i--)
            {   count++;
                y=x/i;    
            }
        }
        catch(ArithmeticException e)
        {
            return count;
        }
        return 0;
    }   
    public static void main(String[]args)
    {   
        int c=0;
        Main obj= new Main();
        c=obj.method();
        try
        {
            if(c!=0)
                throw new MyException("The arithmetic exception has been caught at iteration "+c+" and has been handled by MyException object.");
        }
        catch(MyException me)
        {
            System.out.println(me);
        }
        
    }
}