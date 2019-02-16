import java.util.*;
class A
{
	int a;
	public A(int x)
	{
		System.out.println("A");
	}
	public A()
	{
		System.out.println("A 2");
	}
}
class B extends A
{
	int b;
	public B()
	{
		this(4);
		System.out.println("B 1");
	}
	public B(int t)
	{
		
		System.out.println("B 2");
	}
}
public class constchain {
	public static void main(String[] args)
	{
		B obj=new B();
		
	}

}
