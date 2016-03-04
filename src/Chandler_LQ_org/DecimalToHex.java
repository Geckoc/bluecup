package Chandler_LQ_org;

import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToHex {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String num = scanner.nextLine();
	
	BigInteger step = new BigInteger(num);
	
	System.out.println(step.toString(16).toUpperCase());
}
}
