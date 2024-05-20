//custom exception
class RitamException extends Exception
{
	public RitamException(String str)
	{
		super(str);
	}
}
/*class RitamException extends RuntimeException
{
	public RitamException(String str)
	{
		super(str);
	}
}*/
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
        throw new RitamException("I don't want to print zero.");
    }
    catch(RitamException e)
    {
      j = 18/1;
      System.out.println("that's the default output");
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

