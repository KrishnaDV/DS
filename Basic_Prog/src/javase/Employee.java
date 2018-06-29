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
public class Employee {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter eid");

        int empid = s.nextInt();
        
        System.out.println("Enter ename");
        
        String empname = s.nextLine();
        empname = s.nextLine();
        Employe1 e = new Employe1();

        e.setEid(empid);

        e.setEname(empname);
       // System.out.println("Reached here");
        System.out.println(e.getEid());
        System.out.println(e.getEname());
    }
}

 class Employe1{
   private  int eid;
   private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

   
   //public void print(){
    //System.out.println("Hello from class");
}
    
 