package com.revature.dsa.stackusinglinkedlist;

import com.revature.dsa.singlylinkedlist.Node;
import com.revature.dsa.singlylinkedlist.SinglyLinkedList;

public class Stack {
	private SinglyLinkedList<Integer> list;
	private int top;
	
	public Stack() {
		this.list = new SinglyLinkedList<>();
	}
	
	public int size() {
		return -2;
	}

	public void push(int data) {
	}
	
	public int peek() {
		return 0;
	}
	
	public int pop() {
		return 0;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public String toString() {
		if (list.getHead() == null) {
			return "Stack is Empty";
		}
		String result = "";
		Node<Integer> pointer = list.getHead();
		while (pointer != null) {
			if (pointer == list.getTail()) {
				result += "Top -> " + pointer.getData() + "\n";
			} else {
				result += "       " + pointer.getData() + "\n";
			}
			pointer = pointer.getNext();
		}
		return result;
	}
}
