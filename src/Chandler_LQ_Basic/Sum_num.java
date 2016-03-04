package Chandler_LQ_Basic;

import java.util.Scanner;

public class Sum_num {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long n=scanner.nextInt();
		long sum=0;	
		for(int i=1;i<=n;i++)
		{
			//sum=sum+i;
			sum+=i;
		}
		System.out.println(sum);
	}

}
