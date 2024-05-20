class Demo
{
  public static void main(String a[])
  {
    int i=2;
    int j=0;
    int nums[] = new int[5];
    String str = null;
    try
    {
      j=18/i;
      System.out.println(str.length());
      System.out.println(nums[1]);
      System.out.println(nums[5]);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Cannot divided by zero.........");
      System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException k)
    {
      System.out.println("Stay in your limit....");
      System.out.println(k);
    }
    catch(Exception f)
    {
      System.out.println("Something went wrong...");
      System.out.println(f);
    
    }
    System.out.println(j);
    System.out.println("Bye");
  
  }
}

