package com.revature.dsa.singlylinkedlist;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public Node<T> getHead() {
		return head;
	}
	
	public Node<T> getTail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}
	
	public T get(int index) {
		return null;
	}
	
	public boolean contains(T data) {
		return false;
	}
	
	public void insert(int index, T data) {
		
	}
	
	public void update(int index, T data) {
		
	}
	
	public void delete(int index) {
		
	}
	
	public String toString() {
		Node<T> pointer = head;
		String result = "";
		for (;pointer != null; pointer = pointer.getNext()) {
			result += pointer.toString();
		}
		return result;
	}
}
