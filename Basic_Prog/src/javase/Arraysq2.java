/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Satish
 */
public class Arraysq2 { // Finding the duplicate elements in an array
    public static void main(String[] args) {
        int a[] = {1,3,1,3,1,6,3,2,7,7,7,2,1,4,65,5,343,3};
        
        Set<Integer> set = new HashSet<Integer>();
     
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0; i < a.length; i++){
        	
        	if(hm.containsKey(a[i])){
        		
        		hm.put(a[i],hm.get(a[i])+1);
        		
        		set.add(a[i]);
        		
        	}
        	else{
        		
        		hm.put(a[i],1);
        	}
        	
        }
        
        System.out.println(set);
        
}
}