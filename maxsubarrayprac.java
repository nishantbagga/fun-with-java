import java.util.*;
public class maxsubarrayprac {
public static void main(String[] args)
{
	int i,j,n,sum1,sum2;
	Scanner obj=new Scanner(System.in);
	System.out.print("enter the value of n");
	n=obj.nextInt();
	int arr[]=new int[n];
	System.out.print("enter the array elements");
	for(i=0;i<n;i++)
	{
		arr[i]=obj.nextInt();
	}
	sum1=Integer.MIN_VALUE;
	sum2=Integer.MIN_VALUE;
	for(i=0;i<n;i++)
	{
		for(int k=0;k<i;k++)
		{
			sum1=sum1+arr[k];
		}
		for(j=i+1;j<n;j++)
		{
			sum2=sum2+arr[j];
		}
		if(sum1==sum2)
		{
			System.out.print(i);
			break;
		}
		sum1=0;
		sum2=0;
	}
	
}
}
