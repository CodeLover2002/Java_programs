import java.util.*;
class pa2
{
	public boolean check(int v)
	{
		if(v>0)
			return true;
		else 
			return false;
	}
	public static void main(String[]args)
	{
		pa2 ob=new pa2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x=sc.nextInt();
		System.out.println(ob.check(x)? "Positive number" : "Negative number");
		
	}
}