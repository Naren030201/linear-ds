package com.revature.dsa.stackusingarray;

public class Stack {
	private int[] items;
	private int top;
	
	public Stack() {
		this.items = new int[Short.MAX_VALUE];
		this.top = -1;
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
		if (top == -1) {
			return "Stack is Empty";
		}
		String result = "";
		for (int i = top; i > -1; i--) {
			if (i == top) {
				result += "Top -> " + items[i] + "\n";
			} else {
				result += "       " + items[i] + "\n";
			}
		}
		return result;
	}
}
