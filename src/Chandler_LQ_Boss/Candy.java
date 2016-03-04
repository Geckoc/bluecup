package Chandler_LQ_Boss;

import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int num=0,temp,cy;
        for(int j=0; j<n; j++){
        	arr[j] = scanner.nextInt();
        }
	  while(true){
		  int q=1;
		  for(int i=0; i<n-1; i++){
			  if(arr[i] != arr[i+1]){
				  q=0;
				  break;
			  }
		  }
		 if(q==0) {
			 temp=arr[0];
			 for(int i=0; i<n; i++){
				 cy = temp/2;
				 if(i == n-1){
					 arr[0] = arr[0]/2+cy;
					 break;
				 }else{
					 temp = arr[i+1];
					 arr[i+1] = arr[i+1]/2+cy;
				 }
			 }
			 for(int i=0;i<n; i++){
				 if(arr[i]%2==1){
					 arr[i] +=1;
					 num++;
				 }
			 }
		 }else{
			 break;
		 }
	  }
	   System.out.println(num);
	}

}
