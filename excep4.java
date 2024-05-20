class Demo
{
  public static void main(String a[])
  {
    int i=20;
    int j=0;
   
    try
    {
      j=18/i;
      if(j==0)
        throw new ArithmeticException("I don't want to print zero.");
    }
    catch(ArithmeticException e)
    {
      j = 18/1;
      System.out.println("thats the default output");
      System.out.println(e);
    }
    catch(Exception l)
    {
      System.out.println("Something went wrong..");
    }
    
    System.out.println(j);
    System.out.println("Bye");
  
  }
}

