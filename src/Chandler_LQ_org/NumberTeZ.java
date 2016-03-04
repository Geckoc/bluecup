package Chandler_LQ_org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberTeZ {

	public static void main(String[] args) throws Exception{
		int sum = 0;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String arrays = buf.readLine();
        int n = Integer.parseInt(arrays);
        String arrays2 = buf.readLine();
        String[] a = arrays2.split(" ");
        int[] j =new int [n];
         for(int i=0; i<n; i++){
        	 j[i] = Integer.parseInt(a[i]);
        	sum=sum+j[i];
         }
         Arrays.sort(j);
         System.out.println(j[n-1]);
         System.out.println(j[0]);
         System.out.println(sum);
         
	}
}
