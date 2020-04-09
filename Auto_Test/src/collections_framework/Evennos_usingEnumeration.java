package collections_framework;

import java.util.Enumeration;
import java.util.Vector;

public class Evennos_usingEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
       Enumeration e=v.elements();
       while(e.hasMoreElements()){
    	  Integer I= (Integer)e.nextElement();
    	  if(I%2==0){
    		  System.out.println(I);
    	  }
       }
	}

	private static Integer Integer(Object nextElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
