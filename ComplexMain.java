import java.util.Scanner;
class Complex
{
	int real; 
	int imag;
	Complex()
	{
		real = 1;
		imag = 1;
	}	
	Complex(int r, int i)
	{
		real = r;
		imag = i;
		
	}
	Complex(Complex c)
	{
		real = c.real; 
		imag = c.imag;
		
	}
	Complex addComplex(Complex c)
	{
		Complex a = new Complex();
		a.real = real + c.real;
		a.imag = imag + c.imag;
		System.out.print("\n("+real+" + "+imag+"i) + ("+c.real+" + "+c.imag+"i)");
		return a;
	}
	
	Complex subtractComplex(Complex c)
	{
		Complex s = new Complex();
		s.real = real - c.real;
		s.imag = imag - c.imag;
		System.out.print("\n("+real+" + "+imag+"i) - ("+c.real+" + "+c.imag+"i)");
		return s;
	}
	
	Complex multiplyComplex(Complex c)
	{
		Complex m = new Complex();
		m.real = (real*c.real) - (imag*c.imag);
		m.imag = (real*c.imag) + (imag*c.real);
		System.out.print("\n("+real+" + "+imag+"i) * ("+c.real+" + "+c.imag+"i)");
		return m;
	}
	
	void showComplex()
	{
		System.out.print(" = "+real+"+"+imag+"i");
	}
	
	
}
public class ComplexMain
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex(2,3);
		Complex c4 = new Complex(c1);
		Complex c6 = new Complex(5,7);
		Complex add = new Complex();
		add = c6.addComplex(c2);
		add.showComplex();
		Complex sub = new Complex();
		sub = c6.subtractComplex(c2);
		sub.showComplex();
		Complex mul = new Complex();
		mul = c6.multiplyComplex(c2);
		mul.showComplex();
		
	}
}
