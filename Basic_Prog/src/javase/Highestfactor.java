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
public class Highestfactor {
    public static void main(String[] args) {
        int num =0;
        int count =0;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Factors are :");
        for (int i = 1; i <=a ; i++) {
            if(a%i==0){
                count ++;
              num  = i;   
                System.out.println(num);
            }
           
            
        }
        System.out.println("Total No of factors are :" +count );
    System.out.println("Highest Factor is " +num );
    }
    
}
