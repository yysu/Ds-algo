import java.util.*;
import java.lang.*;
import java.io.*;

interface B {
	public void c();
}

abstract class A implements B {
	public void A(){System.out.print("Ω");}
	public abstract void a();     //correct
	public final void f() {System.out.print("⌃");}   //correct
	public void g() {System.out.print("⍦");}
	public final double zz = 0.0;
}

class C extends A   //correct
{
	public C() {
		super();
		System.out.print("Ω");
	}
	public void a() {
		System.out.print("⍬");
	}
	public void c() {
		System.out.print("u");
	}
	public void d() {
		System.out.print("0");
	}
	/*
	public void f() {
		System.out.print("w");
	}*/
	public void g() {
		System.out.print("II");
	}
}


class Question2_Solve {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		A a1 = new C();
		C c1 = new C();
		c1 = (C)a1;
		c1.d();
		a1.g();
	}
}
