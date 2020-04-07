package collections_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A HashMap contains values based on the key.
		 * It contains only unique elements.
		 * It may have one null key and multiple null values.
		 * It maintains no order.
		 * hashmap is non-synchronised  -- not thread safe // more than one thread / multiple thread can be accessed
* It gives Concurrent modification exception -- in case of Fail - Fast condition //u r tring to access a element but it's removed
		 * 
		 */
		
		HashMap <Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "Java");
		hm.put(3, "Visual Studio");
		
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		HashMap<Integer, Employee_Arraylist> emp= new HashMap<Integer, Employee_Arraylist>();
		//constructor for objject creation
		Employee_Arraylist emp1=new Employee_Arraylist(001, "JohnMatthew", "Computers");
		Employee_Arraylist emp2=new Employee_Arraylist(002, "JohnStephen", "Commerce");
		Employee_Arraylist emp3=new Employee_Arraylist(003, "JohnRosaries", "Biology");
		
		emp.put(1, emp1);
		emp.put(2, emp2);
		emp.put(3, emp3);
		
		for(Entry<Integer,Employee_Arraylist> m : emp.entrySet()){
			int key=m.getKey();
			Employee_Arraylist value= m.getValue();
			System.out.println(key +" Info : "+ value.id +" "+ value.name+ " " +value.dept);
			
			
		}
		
	}

}
