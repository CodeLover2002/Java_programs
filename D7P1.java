class A
{
    public void show()throws Exception
    {
        int nums[] = new int[5];
        System.out.println(nums[1]);
        System.out.println(nums[5]);
    }

}
class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}
class Main
{
    public static void main(String[]args)
    {
        int i=0;
        int j=0;
        
        try
        {
            j=18/i;
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
        try
        {
            A obj = new A();
            obj.show();
        }
        catch(Exception f)
        {
            System.out.println("Array index can't have same value as length. ");
            f.printStackTrace();
        }
        j=0;
        try
        {
            if(j==0)
            {
                throw new MyException("Invalid value of j which is zero and cannot be accepted. ");
            }
        }
        catch(MyException g)
        {
            j = 18/1;
            System.out.println("that's the default output");
            System.out.println(g);
            g.printStackTrace();
        }
        finally
        {
            System.out.println("All the keywords of exception has been used. ");
        }
    }

}