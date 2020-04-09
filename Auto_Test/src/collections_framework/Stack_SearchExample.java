package collections_framework;

import java.util.Stack;

public class Stack_SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		s.push('A');
		for(int i=1;i<=10;i++){
			s.push(i);
			System.out.println(s);
		}
	
		System.out.println(s.pop()); //returns last element from the stack = 10
		System.out.println(s.peek()); //9
		System.out.println(s.search(1)); //9 count the index value from reverse as it is LIFO
		System.out.println(s.search('A')); //10
		System.out.println(s.search('Z')); //-1 //no element so returns -1
	}

}
