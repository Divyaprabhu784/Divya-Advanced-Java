/*1.Write a Java program to traverse / iterate all the keys with the specified value in a HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) [ hint : 6. Iterating Over Map in the worked out example]*/
package collections;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class HashMapSearchByValue{
	public static void main(String[] args) {
		HashMap< Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
		System.out.println("Key: "+entry.getKey() + " -> Value: " + entry.getValue());
		}
		
	}

}
