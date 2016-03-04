package Chandler_LQ_Basic;

import java.util.Scanner;
public class Circular {
	private static double PI=3.14159265358979323;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int r=scanner.nextInt();
		if(r>=1 && r<=10000)
		{ 
			double circular=PI*r*r;
			System.out.printf("%.7f", circular);
	//		String result=String.format("%.7f", circular);
		//	System.out.println(result);
		}
	}

}
