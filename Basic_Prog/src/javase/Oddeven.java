/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Oddeven {
    public static void main(String[] args) {
        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList <Integer> odd = new ArrayList<Integer>();
        System.out.println("Enter Range");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i=a; i<b;i++)
        {
            if(i%2==0)
            {
                even.add(i);
            }
        else
                odd.add(i); 
                
        }
        System.out.println("Even List is " + even);
        System.out.println("Odd List is " + odd);
    }
    
}
