 class A
 {
  void show() throws ClassNotFoundException
  {
    Class.forName("Sweety");  
  
  }
 }
 class Demo
 {
    
    static
    {
      System.out.println("Jai Shree Ram!");
    }
    
    
    public static void main(String r[])
    {
      A obj = new A();
      try
      {
        obj.show();
      }
      catch(ClassNotFoundException e)
      {
        e.printStackTrace();
      }
    
    }
 
 }
