/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

// Finding pairs of numbers in integer array whose sum is equal to the given number
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Satish
 */
public class Arrayq5 {
    public static void main(String[] args) {
        int a[] = {1,3,2,4,6,-1};
        
        int sum = 5;
        
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        List<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<a.length; i++){
        	hm.put(a[i],1);
        	
        	if(hm.containsKey(sum-a[i])){
        		al.add(a[i]);
        	}
        }
       
        for(int res : al){
        	
        	System.out.println(res+" "+Math.abs(sum-res));
        }
        
        
}
}
