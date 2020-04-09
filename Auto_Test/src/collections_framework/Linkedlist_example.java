package collections_framework;

import java.util.LinkedList;

public class Linkedlist_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list= new LinkedList();
list.add("Tom");
list.add("Jones");
list.add("Bob");
list.set(0, "Rob"); //set REPLACES Tom with Rob
list.add(0,"Morris"); //[Morris,Rob,Jones,Bob]
System.out.println(list);
	}

}
