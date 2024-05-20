import java.util.*;
class Test
{
    synchronized void test()
    {
        Thread t= Thread.currentThread();
        for(int i=0;i<100;i++)
         {
            
            try
            {
                System.out.println(t.getName());
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error.");    
            }
         }
    }
}
class TD extends Thread
{
    public void run()
    {
        obj.test();
    }
}

class Main 
{
    public static void main(String[]args)
    {
        final Test obj= new Test();
        TD a = new TD();
        TD b = new TD();
        a.setName("Thread A");
        b.setName("Thread B");
        a.start();
        b.start();
        
        
    }
}