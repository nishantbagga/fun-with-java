import java.util.*;
import java.lang.*;
class ABC extends  Thread
{
	public void run()
	{
	for(int i=1;i<=10;i++)
		System.out.println("thread a"+i);
}
}
class Bc extends Thread
{
	public void run() {
		for(int k=1;k<=10;k++)
			System.out.println("Thread B"+k);
	}
}

public class threadclass {
	public static void main(String[] args)
	{
		ABC t1=new ABC();
		Bc t2=new Bc();
		t1.start();
		t2.start();
		}
}