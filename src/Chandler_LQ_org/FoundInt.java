package Chandler_LQ_org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FoundInt {
	public static void main(String[] args)throws Exception {
     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(buf.readLine());
     String str =buf.readLine();
     String s[] =str.split(" ");
     String s1 =buf.readLine();
     int x = Integer.parseInt(s1);
     int a[] = new int [n];
     for(int i = 0; i<s.length; i++){
    	 a[i] = Integer.parseInt(s[i]);
     }
      for(int j = 0; j<s.length; j++){
    	  if(j==s.length-1 && x!=a[s.length-1]){
    		  System.out.println(-1);
    		  break;
    	  }
    	  if(x==a[j]){
    		  System.out.println(j+1);
    		  break;
    		  
    	  }
	}
	}
}
