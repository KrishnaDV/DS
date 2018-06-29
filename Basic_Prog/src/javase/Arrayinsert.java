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
public class Arrayinsert {
    public static void main(String[] args) {
         int a[] = new int[10];
         
          System.out.println("enter elements :");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i] = s.nextInt();
          
        }
   System.out.println("enter new position :");
  
  int pos = s.nextInt();

  System.out.println("enter new  element :"); 
  int num = s.nextInt();
    for(int i=(a.length-1);i>pos;i--)
    {
      // a[pos] = num;
    a[i] = a[i-1];
    //a[pos] = num;
    }
    a[pos]=num;
   System.out.println("After Insertion");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+"\t");
    }
    }
}

