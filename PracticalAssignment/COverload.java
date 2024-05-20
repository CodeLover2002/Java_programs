class Constructor
{
    int a;
    float b;
    Constructor()//default
    {
        a=1;
        b=3;
    }
    Constructor(int A,float B)//parameterized
    {
        a=A;
        b=B;
    }
    Constructor(Constructor c)//copy
    {
        a=c.a;
        b=c.b;
    }
    public static void main(String[]args)
    {
        // Constructor ob = new Constructor();
        Constructor ob2 = new Constructor(5,10.5f);
        Constructor ob3 = new Constructor(new Constructor(16,23.0f));
        // System.out.print("Ob: ");
        // System.out.println("\na = "+ob.a+"\t"+"b = "+ob.b);
        System.out.print("Ob2: ");
        System.out.println("\na = "+ob2.a+"\t"+"b = "+ob2.b);
        System.out.print("Ob3: ");
        System.out.println("\na = "+ob3.a+"\t"+"b = "+ob3.b);
        
    }
}