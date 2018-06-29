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
public class Perfect {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum =0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum += i;
            }
        }
       if(a==sum){
           System.out.println("Its a perfect number");
         } 
       else{
           
                  System.out.println("Not a perfect number");
       }
    }
}
