package Chandler_LQ_Basic;

import java.util.Scanner;

public class Fibonacci_Recursion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=F(n);
        System.out.println(sum%10007);
	}
  public static int F(int n)
  {
	  if(n==1||n==2){
		  return 1;
	  }else{
		  return F(n-1)+F(n-2);
	  }
  }
}
