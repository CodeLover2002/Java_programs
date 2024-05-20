class Sum
{
    int a=5,b=6;
    static int x=9;
    void simple()
    {
        System.out.println("Hello. I don't need an object.");    
    }
    void check()
    {
        System.out.println(x);
        simple();
        Sum.another();
    }
    static void another()
    {
        System.out.println("Hello. I need the class.");
    }
    public static void main(String[]args)
    {
        Sum ob = new Sum();
        int z= ob.a+ob.b;
        Sum ob1 = new Sum();
        ob1.a=ob1.a+5;
        System.out.println(ob1.a);
        System.out.println(ob.a);
        System.out.println(ob.x);
        ob1.x=ob1.x+5;
        System.out.println(ob1.x);
        System.out.println(ob.x);
        System.out.println(x);//static variable directly written inside static function
        System.out.println(z);
        ob.check();
        another();
    }
}