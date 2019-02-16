import java.util.*;
public class summaxsubarray {

	public static void main(String[] args) {
		int i,j,n,sum,cmax,omax,lv=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the value of n");
		n=obj.nextInt();
	    int arr[]=new int[n];
	    System.out.print("enter the array values");
	    for(i=0;i<n;i++)
	    {
	    arr[i]=obj.nextInt();
	    }
	  
	     cmax=Integer.MIN_VALUE;
	     omax=Integer.MIN_VALUE;
	     i=0;
	     while(i<n)
	     {
	    	 if(cmax+arr[i]>arr[i])
	    	 {
	    		 cmax=cmax+arr[i];
	    	 }
	    	 else
	    	 {
	    		 cmax=arr[i];
	    	 }
	    	 if(cmax>omax)
	    	 {
	    		 omax=cmax;
	    	 }
	    	 i++;
	     }
	     System.out.println("the sum of maxsubarray is "+omax);

	}

}
