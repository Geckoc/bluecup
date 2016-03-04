package Chandler_LQ_Basic;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long f1=1,f2=1;
		long result=0,sum=0;
		if(n==1 || n==2){
			result=1;
		}
		else {
			for(int i=3;i<=n;i++)
			{
				sum=f1+f2;
				f2=f1;
				f1=sum%10007;
			}
			result=sum%10007;
		}
		System.out.print(result);
	}
}
