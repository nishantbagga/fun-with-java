import java.util.*;
public class targetsum {

	public static void main(String[] args)
	{
		int a,b,target,i,j,n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n for array");
		n=obj.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements");
		for(i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("enter the target sum");
		target=obj.nextInt();
		a=0;
		b=n-1;
		while(a<b)
		{
			if(arr[a]+arr[b]==target)
			{
				System.out.println(arr[a]+" "+arr[b]);
				a++;
				b--;
			}
			else if(arr[a]+arr[b]>target)
			{
				b--;
			}
			else
			{
				a++;
			}
				
		}
		
		
		
	}
}
