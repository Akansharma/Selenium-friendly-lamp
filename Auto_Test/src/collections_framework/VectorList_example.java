package collections_framework;

import java.util.Vector;

public class VectorList_example {

	public static void main(String[] args) {
		
	Vector v=new Vector();
	System.out.println(v.capacity());  //10 legac class
	
	for(int i=1;i<=10;i++)
	{
		v.addElement(i);
		
	}
	System.out.println(v.capacity()); //10
	v.addElement("A");
	System.out.println(v.capacity()); // 20 after inserting addElement("A")
	v.remove(0);
	v.addElement(100);
	System.out.println(v);
	}
}
