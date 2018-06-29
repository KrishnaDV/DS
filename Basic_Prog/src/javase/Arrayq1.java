/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Arrayq1 { // given an array of integers of 1 to 10, find the missing number in the array
    public static void main(String[] args) {
        int a[] = new int[10];
       int sum=0, sum1=0, sum2=0;
        for(int i=1; i<11;i++)
        {
           sum += i;
            a[i-1] = i;
        }
        System.out.print("Original array is \t");
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]); // calculate sum of original array ( array containing all numbers)
           System.out.print("\t");
        }
    System.out.println("Enter new array");
    Scanner s = new Scanner(System.in);
    int b[] = new int[10];
    
    for(int i=0;i<(b.length-1);i++){
    b[i] = s.nextInt();
    }
    System.out.print("User array is"); // user input with missing number
    for(int i=0;i<(b.length-1);i++){
        System.out.print(b[i]);
         System.out.print("\t");
    }
    for(int i=0;i<b.length;i++){
        sum1 += b[i];
    }
     sum2 = sum - sum1; // new sum gives the missing value
    System.out.print("missing element in  array is \t"+sum2);
    }
}
