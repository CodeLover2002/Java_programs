class StaticOuter
{
    int x=10;
    static int y=5;
    void test()
    {
        StaticInner in= new StaticInner();
        in.display();
    }    
    static class StaticInner
    {
        void display()
        {
            StaticOuter ob = new StaticOuter();
            System.out.println(ob.x);
            System.out.println(y);
            
        }
    }
    
}
class InnerOuter
{
    int x=15;
    static int y=20;
    void test()
    {
        Inner in= new Inner();
        in.display();
    }    
    class Inner
    {
        void display()
        {
            System.out.println(x);
            System.out.println(InnerOuter.y);
            
        }
    }    
}
class Main
{
    public static void main(String[]args)
    {
        StaticOuter ob = new StaticOuter();
        ob.test();
        InnerOuter ob1 = new InnerOuter();
        ob1.test();
    }
}