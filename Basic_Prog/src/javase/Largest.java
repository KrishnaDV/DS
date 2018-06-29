/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Largest {
    
    public static void main(String[] args) {
        
    	int [] a = {1,23,4,12,234,5664,43};
    	
    	int Highest = Integer.MIN_VALUE;
    	
    	for(int i=0; i<a.length;i++){
    		
    		if(a[i]>Highest){
    			
    			Highest = a[i];
    		}
    		
    	}
        
    	System.out.println("Highest number is "+Highest);
    }
}
