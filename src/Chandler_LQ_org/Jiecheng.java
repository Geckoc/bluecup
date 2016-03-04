package Chandler_LQ_org;
import java.math.BigInteger;
import java.util.Scanner;
public class Jiecheng {
	public static BigInteger factorial(int n){       
        if(n>0){
        	return BigInteger.valueOf(n).multiply(factorial(n-1));
        }else{
        	return BigInteger.ONE;
        }
    } 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
      //   for(int i=1;i<=n;i++){
			System.out.println(n+"µÄ½×³ËÊýÊÇ:"+factorial(n));
        // }
		
   }
}
