import java.util.*;
class Dhiru
{
    int x;
    Dhiru(int x)
    {
        this.x=x;
    }
}
class Mukesh extends Dhiru
{
    int y;
    Mukesh(int a,int b)
    {
        super(b);//to call constructor of superclass
        this.y=a;
    }
}
interface A 
{
    int z1=15;
}
interface B 
{
    int z2=20;
}
class Anant extends Mukesh implements A,B
{
    int a=50;
    Anant(int p,int q)
    {
        super(p,q);
    }
    void sum()
    {
        System.out.println(a+x+y+z1+z2);    
    }
    public static void main(String[]args)
    {
        Anant ob = new Anant(100,150);
        ob.sum();
    }
}
