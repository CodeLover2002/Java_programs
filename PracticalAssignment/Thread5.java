import java.util.*;
class A extends Thread
{
    public void run()
    {
        System.out.println("Entered A.");
        Thread tA= Thread.currentThread();        
        System.out.println("Priority of A: "+tA.getPriority());
        System.out.println("Name of thread: "+tA.getName());
        // System.out.println(tA.getID());
        System.out.println("Thread State: "+tA.getState());
        System.out.println("Thread Alive? "+tA.isAlive());
        
        for(int i=0;i<100;i++)
         {
            try
            {
                System.out.println("This is A.");
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error.");    
            }
         }
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("Entered B.");
        Thread tB= Thread.currentThread();
        System.out.println("Is B daemon thread? "+tB.isDaemon());
        for(int i=0;i<100;i++)
        {    
            try
            {
                System.out.println("This is B.");
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error.");    
            }   
        }
    }
}
class C extends Thread
{
    public void run()
    {
        
        for(int i=0;i<100;i++)
        {    
            try
            {
                System.out.println("This is C.");
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error.");    
            }   
        }    
    }
}
class Main 
{
    public static void main(String[]args)
    {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        
        ob1.setPriority(Thread.MIN_PRIORITY);
        ob1.setName("Thread A");
        
        ob2.setDaemon(true);        
        ob3.setPriority(Thread.MAX_PRIORITY);
        
        
        ob1.start();
        try
        {
            ob1.join();//main thread will wait until thread A terminates
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        ob2.start();
        try
        {
            ob2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        ob3.start();
    }
}