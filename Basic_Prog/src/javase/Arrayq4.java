/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;
// Find the location of given ele in array
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Arrayq4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("Enter array");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            
        }
        System.out.println("Enter element & pos");
        int ele = s.nextInt();
        //int pos = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(ele == a[i]){
                System.out.println("Element found at location " + i);
            }
            else{
                System.out.println("Element not in array");
            }
        }
        
    }
    
}
