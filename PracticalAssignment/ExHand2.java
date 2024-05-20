import java.util.*;
class A 
{
    public static void main(String[]args)
    {
        try
        {
            int a=2,b=4,c=2,x=7,z;
            int p[]={2};
            p[3]=33;
            
            try
            {
                z=x/((b*b)-(4*a*c));
                System.out.println("Value of z= "+z);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}