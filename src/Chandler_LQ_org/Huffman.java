package Chandler_LQ_org;

import java.util.Arrays;
import java.util.Scanner;

public class Huffman {
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			int[] huff = new int[num];
			for (int i = 0; i < num; i++)
				huff[i] = scanner.nextInt();
			int sum = 0;
			int k = 0;
			while (num > 1) {
				Arrays.sort(huff);
				k = huff[0] + huff[1];
				sum = sum + k;
				huff[0] = k;
				huff[1] = Integer.MAX_VALUE;
				num--;
			}
			System.out.println(sum);
		}
	}
}

