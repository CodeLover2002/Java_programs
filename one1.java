import java.util.*;
class Time
{
	int hr,min,sec;
	Time()
	{
		hr=0;
		min=0;
		sec=0;
	}
	Time(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	void tconverter(Time ob1)
	{
		if(ob1.hr>12)
			ob1.hr=ob1.hr-12;
		
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in hour min second format separated by spaces ");
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		Time ob = new Time(h,m,s);
		String ap;
		if(h<12)
			ap="a.m";
		else if(h==12 && (m>0||s>0))
			ap="p.m";
		else
			ap="p.m";
		ob.tconverter(ob);
		System.out.println("The time is: "+ob.hr+":"+ob.min+":"+ob.sec+ap);
			
		

	} 
}