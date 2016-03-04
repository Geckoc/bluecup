package Chandler_LQ_org;

import java.util.Scanner;

public class HexToDecimal {
	private static void transform(){
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		String arr = null;
		if( num.length() <= 8){
			arr = Long.valueOf(num, 16).toString();
		}
         System.out.println(arr);		
	}
   public static void main(String[] args) {
	   transform();
   }
}
