import java.util.*;
public class Exceptionhandle {
public static void main(String[] args)
{
	try
	{
		System.out.println("hello");
		System.out.print(3/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmatic exception");
	}
     finally
     {
		System.out.println("hello world");
	
}
}
}
