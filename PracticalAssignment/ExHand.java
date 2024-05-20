class Demo
{
    public static void main(String[]args)
    {
        int a[]={5,10};
        int b=5;
        try
        {
            int c= a[1]/(a[0]-b)*a[2];
        }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println(f);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayStoreException g)
        {
            System.out.println(g);
        }
    }
}