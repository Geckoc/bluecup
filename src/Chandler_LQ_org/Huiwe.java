package Chandler_LQ_org;


public class Huiwe {
         static char []str2 = new char[10];
	public static void main(String[] args) {
		  for(int i=1000; i<10000; i++){
			  String str1 = String.valueOf(i);
			str2 = str1.toCharArray();
			if(i < 10000 && str2[0]==str2[3] && str2[1] == str2[2])
				{
				System.out.println(i);
				}
		  }
		 }
		}