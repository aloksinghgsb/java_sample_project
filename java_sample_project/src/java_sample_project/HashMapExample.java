package java_sample_project;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
//		HashMap<Integer,String> name=new HashMap<Integer,String>();
//		name.put(100,"Dog");
//		name.put(200,"Cat");
//		name.put(300,"Cow");
//		System.out.println(name);
//		
////		for(Map.entry(null, null))
//		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//		   map.put(1,"Mango");  //Put elements in Map  
//		   map.put(2,"Apple");    
//		   map.put(3,"Banana");   
//		   map.put(4,"Grapes");   
//		       
//		   System.out.println("Iterating Hashmap...");  
//		   for(Map.Entry m : map.entrySet()){    
//		    System.out.println(m.getKey()+" "+m.getValue()); 
//		    }
		    String s1="sonu123Alok34#2Singh";
		    System.out.println("Before replace String: "+s1);
		    s1 = s1.replaceAll("[^a-zA-Z]", "");
		    System.out.println("After replace number: "+s1);
		    
		    String str= "This#string%contains^special*characters&."; 
		    System.out.println("Before replace String: "+str);
		    str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		    System.out.println(str);  
		  
	}

}
