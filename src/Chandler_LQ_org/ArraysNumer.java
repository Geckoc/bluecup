package Chandler_LQ_org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysNumer {
	public static void main(String[] args)throws Exception {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(buf.readLine());
      String s = buf.readLine();
      String s1[] = s.split(" ");
      StringBuilder sb=new StringBuilder(); 
      //
      /* ִ���ٶ� StringBuilder > StringBuffere
       * StringBuffere �̰߳�ȫ�ġ�~Builder�Ƿǰ�ȫ�� 
       * StringBuilder�����ڵ��߳�. StringBuffere�����ڶ��߳�
       */
       int a[]=new int[n];
      for(int i = 0; i < n; i++){
    	  a[i] =Integer.parseInt(s1[i]);
      }
      Arrays.sort(a);
      for(int j = 0; j < n; j++)
		sb.append(a[j]).append(" ");
         System.out.println(sb);
	}
}
