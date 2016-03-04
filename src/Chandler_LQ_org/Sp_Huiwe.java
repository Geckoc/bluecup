package Chandler_LQ_org;

import java.util.Scanner;

public class Sp_Huiwe {

	public static void main(String[] args){
		   int n = 0;
	       Scanner input = new Scanner(System.in);
	       n = input.nextInt();
	      for(int i=10000; i<1000000; i++){
	    	  if(translate(i, n)){
	    		  System.out.println(i);
	    	  }
	      }
	   }
	private static boolean translate(int i,int n){
	       String temp = String.valueOf(i);
	       if (sum(temp) != n) {
	           return false;
	       }
	       StringBuilder builder = new StringBuilder(temp);
	       builder = builder.reverse();
	       if (temp.equals(builder.toString())) {
	           return true;
	       }
	       return false;
	   }
	   private static int sum(String temp){
	       int sum = 0;
	       for (int i = 0; i < temp.length(); i++) {
	           sum += (temp.charAt(i)-'0');
	       }
	       return sum;
	   }
	}
