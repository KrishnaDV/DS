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
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner s = new Scanner(System.in);
        int count =0;
        int ll = s.nextInt();
        int ul = s.nextInt();
        for(int i=ll;i<ul;i++){
            int a = i, rd=0;
            while(a!=0){
            int d = a % 10; // get rightmost digit
            rd = rd * 10 + d; // mul the num with 10 and add rightmost digit
            a /= 10;// divide the org num;
            }
            if(rd==i){
                System.out.println(i);
                count++;
            }
       }
         if(count == 0){
            
            System.out.println("No numbers");
        }
    }
}
