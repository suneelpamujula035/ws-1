package collections;

import java.util.Stack;

public class Stack_01 {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
	}

}
