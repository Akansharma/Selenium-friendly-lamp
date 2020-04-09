package collections_framework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Test_ArraynLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList arr=new ArrayList();
LinkedList ll=new LinkedList();

System.out.println(arr instanceof Serializable);
System.out.println(arr instanceof Cloneable);
System.out.println(arr instanceof RandomAccess); //random access is available only for ArrayList and Vector Classes

System.out.println(ll instanceof Serializable);
System.out.println(ll instanceof Cloneable);
System.out.println(ll instanceof RandomAccess);
	}



}
