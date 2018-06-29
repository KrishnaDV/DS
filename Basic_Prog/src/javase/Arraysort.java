package javase;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satish
 */
public class Arraysort {
    public static void main(String[] args) {
        int a[] = new int[10];
       System.out.print("Enter elements");
       System.out.print("\t");
            for(int i=0;i<10;i++)
        {
     Scanner s = new Scanner(System.in);
     System.out.print("\t");
     a[i] = s.nextInt();
     
        }
            System.out.println("Before Sorting");
                    for(int i=0;i<a.length;i++){
                            System.out.print(a[i]+"\t");
                                }
     
     for(int i=0;i<a.length;i++)
     {
         for(int j=i+1;j<10;j++)
         {
          if(a[j]>a[i])
          {
              int temp = a[j];
              a[j]= a[i];
              a[i]= temp;
          }
            
         }
     }
    System.out.print("After sort \t");
     for(int i=0;i<a.length;i++){
                            System.out.print(a[i]+"\t");
                                }
     
    }
    
    
}
