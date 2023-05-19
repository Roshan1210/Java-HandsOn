package first;//sum of first n natural numbers , even and odd ```

import java.util.Scanner;

public class Twentythree {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no upto which you want sum");
		int n=sc.nextInt();
		int sum=0;
		int sume=0;
		int sumo=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		
		for(int j=1;j<=n;j++) {//adding odd no in 1st 20 natural no
			if(j%2==0) 
			{
			sume=sume+j;
			}
		}
		
		for(int k=1;k<=n;k++) {//adding odd no in 1st 20 natural no
			if(k%2!=0) 
			{
			sumo=sumo+k;
			}
		}
		

		for(int k=1;k<=n;k++) {
			if(k%2!=0) 
			{
			sumo=sumo+k;
			}
		}
		int add=0;
		int l=0;
		int no=1;
		while(l<=n) {//adding 1st 20 even no.s
			if(no%2==0) {
				add=add+no;
				l++;
			}
			no++;
			
		}
		
		
		
		
		
		System.out.println("sum is "+sum);
		System.out.println("sume is "+sume);
		System.out.println("sumo is "+sumo);
		System.out.println("sum is "+add);
		
		sc.close();
		
	}

}
