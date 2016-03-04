package Chandler_LQ_org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal {
	public static void main(String[] args)throws NumberFormatException,IOException {
     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
     int time =Integer.parseInt(buf.readLine());
     int triangle[][] = new int [time][time];
     triangle[0][0] = 1;
     for(int i=0; i<time; i++){
    	 for(int j=0; j<i+1; j++){
    		 if(j==0){
    		 triangle[i][j] = 1;}
    		 else{
    			 triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j];
    		 }
    		 System.out.print(triangle[i][j]);
    		 System.out.print(" ");
    	 }
    	 System.out.println();
     }
	}
}
