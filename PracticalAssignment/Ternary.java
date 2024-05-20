import java.util.*;
class TOp
{
    // boolean check(int a, int b)
    // {
    //     if(a>b)
    //         return true;
    //     else
    //         return false;
        
    // }
    public static void main(String[]args)
    {
        int x=Integer.valueOf(args[0]);
        int y=Integer.valueOf(args[1]);
        int z=Integer.valueOf(args[2]);
        int max;
        max=(x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println("The maximum number is: "+max);
    }
}