class pa4
{
	int x=10;
	int max(int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[]args)
	{
		pa4 ob=new pa4();
		int v=90;
		int xx=ob.max(v);
		System.out.println(xx);
	}
}
