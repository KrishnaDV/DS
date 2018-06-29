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
public class Fibonacci {
    public static void main(String[] args) {
        int f1=0,f2=1,f;
        System.out.println("Enter limit");
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        System.out.println("fibonacci series");
        System.out.println(f1);
        System.out.println(f2);
        for(int i=0;i<limit;i++)
        {
            f=f1+f2;
            f1=f2;
            f2=f;
        System.out.println(f);
     //  System.out.println();
        }
    }
    
}
