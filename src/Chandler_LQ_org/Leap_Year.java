package Chandler_LQ_org;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int scanner=new Scanner(System.in).nextInt();
		if (scanner>=1990 && scanner <=2050) {
			
        if (scanner%400==0 || scanner%4==0 && scanner %100!=0) {
			System.out.print("yes");
		} else{
			System.out.print("no");
		}
		}else return;
	}
}
