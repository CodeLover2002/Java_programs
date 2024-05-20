import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Demo
{
  public static void main(String aw[]) throws NumberFormatException, IOException
  {
    int num=0;
    BufferedReader bf = null;
    try
    {
      InputStreamReader in = new InputStreamReader(System.in);
		  bf = new BufferedReader(in);
		  /* or
		  bf = new BufferedReader(new InputStreamReader(System.in));*/
		  
	    num = Integer.parseInt(bf.readLine());
	    System.out.println(num);
    }
    
    finally
    {
      bf.close();
    }
  }


}
