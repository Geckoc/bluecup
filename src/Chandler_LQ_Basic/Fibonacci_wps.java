package Chandler_LQ_Basic;

import java.util.Scanner;

public class Fibonacci_wps {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int F[]=new int [n+2];
    F[1]=F[2]=1;
    if(n==1 || n==2)
    {
    	F[n]=1;
    } else
    {
    	for(int i=3;i<=n;i++)
    	{
    		F[i]=(F[i-1]+F[i-2])%10007;
    	}
    }
    System.out.println(F[n]);
}
}
