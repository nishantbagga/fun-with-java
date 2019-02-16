import java.util.*;
import java.lang.Thread;
class Abcd implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Thread A"+i);
	}
}
class Bcde implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Thread B"+i);
	}
}
public class threadrunnable {
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Abcd());
		Thread t2=new Thread(new Bcde());
		t1.start();
		t2.start();
	}

}
