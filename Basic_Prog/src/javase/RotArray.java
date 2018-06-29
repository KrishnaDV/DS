package javase;

import java.util.Scanner;

public class RotArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);

		int count = 1;

		String ss = "helloJavaB";
		
		StringBuffer sb = new StringBuffer();

		for (int i =ss.length()-1; i >=0; i--) {
			
			sb.append(ss.charAt(i));

		}

		System.out.println(sb.toString());
	}

}
