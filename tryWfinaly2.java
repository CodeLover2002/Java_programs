import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Demo
{
  public static void main(String aw[]) throws NumberFormatException, IOException
  {
    int num=0;
    
    try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
    {
      num = Integer.parseInt(bf.readLine());
	    System.out.println(num);
    }
  }
  //This is try with resources
  
    


}
