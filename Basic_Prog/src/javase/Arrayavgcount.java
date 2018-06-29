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
public class Arrayavgcount {
    public static void main(String[] args) {
         int a[] = new int[4];
         int sum=0;
          System.out.println("enter elements :");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i] = s.nextInt();
            sum+=a[i];
        }
    float avg = sum /(a.length);
    int count = 0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<avg)
            count++;
    }
    System.out.print("Avg is " + avg);
    System.out.println(" ");
    System.out.print("No of elements below avg are  " + count);
    }
}
