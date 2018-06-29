/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Arrayinterchange {
    public static void main(String[] args) {
        int a[] = new int[10];
        int temp[] = new int[10];
        System.out.println("enter elements :");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i] = s.nextInt();
        }
             System.out.println("Elements before interchange are ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
         for(int i=0;i<(a.length)/2;i++)
         {
             temp[i] = a[i+5];
             a[i+5] = a[i];
             a[i] = temp[i];
         }
         System.out.println("");
         System.out.println("After Interchange");
            for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }  
    }
}

