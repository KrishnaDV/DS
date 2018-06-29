/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

/**
 *
 * @author Satish
 */
public class Stringoperations {
    public static void main(String[] args) {
        String s = new String("Vishal Shalu");
        String s1 = "Indian Cricket Team";
        int s3 = 10;
        System.out.println(s1.toString());
        String s4 = Integer.toString(s3); // To convert an int to String use Integer.toString()
        int s5 = Integer.parseInt(s4); // Convert to integer from String
        System.out.println(s5);
        System.out.println(s4);
        System.out.println(s4.charAt(0)); // Returns char at given position
        for (int i = 0; i <s1.length(); i++) {
            
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println(s1.endsWith("team")); // Returns true if string ends with given substring
        System.out.println(s.concat(s4)); // Concatenates two strings
        System.out.println(s.indexOf("a",6));
        System.out.println(s4.equals(s3)); // Returns true if both strings are equal
        System.out.println(s1.replace("a","i"));
        String words[] = s1.split("");
        for (String word : words) {
            System.out.print(word+" ");
        }
}
}