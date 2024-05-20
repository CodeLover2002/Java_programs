class Demo
{
  public static void main(String a[])
  {
    int i=2;
    int j=0;
    int nums[] = new int[5];
    try
    {
      j=18/i;
      System.out.println(nums[1]);
      System.out.println(nums[5]);
    }
    catch(Exception e)
    {
      System.out.println("Something went wrong");
      System.out.println(e);
    }
    System.out.println(j);
    System.out.println("Bye");
  
  }
}
