import java.util.*;
class Complex
{
	int real,imag;
	Complex()
	{
		real=0;
		imag=0;
	}
	Complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	void add(Complex ob1,Complex ob2)
	{
		this.real=ob1.real+ob2.real;
		this.imag=ob1.imag+ob2.imag;
	}
	void sub(Complex ob1,Complex ob2)
	{
		this.real=ob1.real-ob2.real;
		this.imag=ob1.imag-ob2.imag;
	}
	void mul(Complex ob1,Complex ob2)
	{
		this.real=ob1.real*ob2.real+(-1)*ob1.imag*ob2.imag;
		this.imag=ob1.real*ob2.imag+ob1.imag*ob2.real;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int r,i;
		System.out.println("Enter the first complex number C1 ");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c1= new Complex(r,i);
		System.out.println("Enter the second complex number C2 ");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c2= new Complex(r,i);
		c1.add(c1,c2);
		System.out.println("C1 = C1+C2 = "+c1.real+"+"+c1.imag+"i");
		Complex c3= new Complex();
		c3.add(c1,c2);
		System.out.println("C3 = C1+C2 = "+c3.real+"+"+c3.imag+"i");
		c1.sub(c1,c2);
		System.out.println("C1 = C1-C2 = "+c1.real+"+"+c1.imag+"i");
		c3.sub(c1,c2);
		System.out.println("C3 = C1-C2 = "+c3.real+"+"+c3.imag+"i");
		c3.mul(c1,c2);
		System.out.println("C3 = C1*C2 = "+c3.real+"+"+c3.imag+"i");

	} 
	
}