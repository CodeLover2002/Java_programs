class pa5
{
	void sum(float a, float b,float c)
	{
		System.out.println(a+b+c);
	}
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[]args)
	{
		pa5 ob = new pa5();
		ob.sum(2.5f, 5.5f, 2.0f);
		System.out.println(ob.sum(2,2,2));
	}
}