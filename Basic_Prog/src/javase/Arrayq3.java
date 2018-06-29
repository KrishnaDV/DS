/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.Arrays;
// Accept an array of integers and display the highest and least numbers in the array
import java.util.Scanner;

/**
 * 
 * @author Satish
 */
public class Arrayq3 {
	public static void main(String[] args) {
		int a[] = {34,-3,24,56,7,89};
		
		Arrays.sort(a);
		
		System.out.println("Lowest = "+a[0]);
		
		System.out.println("Highest = "+a[a.length-1]);
		
		
		// O(n)
		int Highest = Integer.MIN_VALUE;
		
		int Lowest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>Highest){
				Highest = a[i];
			}
			
			if(a[i]<Lowest){
				Lowest = a[i];
			}
			
		}
		
		
		System.out.println("High = "+Highest+" "+"Low = "+Lowest);
	}
}
