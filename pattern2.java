
import java.util.Scanner;
public class pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=0,k,n=7;
		for(int i=1;i<=13;i++) {
			if(i<=n)
				m++;
			else
				m--;
			for(int j=1;j<=13;j++) {
				if(j<=n-1+m && j>=n+1-m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
