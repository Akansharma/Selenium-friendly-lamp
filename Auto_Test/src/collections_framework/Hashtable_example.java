package collections_framework;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * +It is similar to HashMap, but is synchronised.
		 * Hashtable stores key/value pair in hash table.
+ In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.

		 * The important points about Java Hashtable class are:
+ A Hashtable is an array of list. Each list is known as a bucket.
The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
+ It contains only unique elements.

+ It may have not have any null key or value. //null pointer exception will be thrown

+ It is synchronized
		 */

		Hashtable ht= new Hashtable();
		ht.put(1, "Selenium");
		ht.put(2, "Winium");
		ht.put(3, "Appium");
		if(ht.containsValue("Appium")){
			System.out.println("value is found");
			
			Enumeration e= ht.elements();
			System.out.println("Print all values using enumeration");
			while(e.hasMoreElements()){
				System.out.println(e.nextElement());
				System.out.println(ht.hashCode());
			}
		}
	}

}
