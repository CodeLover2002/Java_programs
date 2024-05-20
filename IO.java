import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Demo
{
	public static void main(String hj[])throws IOException
	{
		System.out.println("Enter a number");
		
		//int num = System.in.read();
		//System.out.println(num-48);
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
	  int num = Integer.parseInt(bf.readLine());
	  System.out.println(num);
	  
	  bf.close();
	}

}
