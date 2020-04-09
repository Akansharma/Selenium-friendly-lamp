package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_example {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**** dynamic Array ---- Arraylist ****
		 * 
		 * 1. It can contain duplicate values/elements
		 * 
		 * 2. maintain insertion order 
		 * 
		 * 3. Not synchronized/not thread safe
		 * 
		 * 4. Allows to random access to fetch elements values because it stores the values on basis of indexes 
		 * */

		@SuppressWarnings("rawtypes")
		ArrayList arr = new ArrayList();

		arr.add(10);
		arr.add(10);
		
		arr.add("Test");
		arr.add("John");
		arr.add(12);
		System.out.println(arr.size());
		arr.add("last");
		System.out.println(arr.size());
		System.out.println(arr.get(4));
		


		//to print all the values from arralist:forloop
		for (Object allItems : arr) {
			System.out.println(allItems);
		}
			
			//Employee class oject
			Employee_Arraylist emp1=new Employee_Arraylist(001, "JohnMatthew", "Computers");
			Employee_Arraylist emp2=new Employee_Arraylist(002, "JohnStephen", "Commerce");
			Employee_Arraylist emp3=new Employee_Arraylist(003, "JohnRosaries", "Biology");
			//create arraylist for employee
			ArrayList<Employee_Arraylist> ar=new ArrayList<Employee_Arraylist>();
			ar.add(emp1);
			ar.add(emp2);
			ar.add(emp3);
			
			//using Iterartor interface to traverse to the list
			Iterator<Employee_Arraylist> it = ar.iterator();
			while(it.hasNext()){
				Employee_Arraylist emp = it.next();
				System.out.println(emp.name+" "+emp.id+" "+emp.dept);
			
			
		}
			//********************** addAll
			ArrayList<String> arr1= new ArrayList<String>();
			arr1.add("Apple");
			arr1.add("Orange");
			arr1.add("Mango");
			
			ArrayList<String> arr2=new ArrayList<String>();
			arr2.add("Banana");
			arr2.add("Papaya");
			arr2.add("Melons");
			
			arr1.addAll(arr2);
			
			for (String fruits : arr1) {
				System.out.println(fruits);
				
			}
			
			
			
	}

}
